OS=
ifeq ($(shell uname -s),Linux)
	export OS=LINUX
endif
ifeq ($(shell uname -s),Darwin)
	export OS=MACOS
endif
ifeq ($(findstring microsoft,$(shell uname -a)),microsoft)
	export OS=WINDOWS
endif

export TITLE = "\033[32m[%s]\033[0m %s\n"
export ERROR = "\033[31m[%s]\033[0m %s\n"

export PROTOC_GEN_GO_VER=1.36.6
export PROTOC_GEN_KOTLIN_VER=1.4.1
export PROTOC_GEN_JAVA_VER=1.54.1

init::
	@printf "\033[32m[+]\033[0m %s\n" "Initiating.."
	@npm install
	@go install google.golang.org/protobuf/cmd/protoc-gen-go@v1.36.11
	@go install google.golang.org/grpc/cmd/protoc-gen-go-grpc@v1.6.1
	@go install github.com/grpc-ecosystem/grpc-gateway/v2/protoc-gen-grpc-gateway@v2.29.0
	@go install github.com/grpc-ecosystem/grpc-gateway/v2/protoc-gen-openapiv2@v2.29.0
	@go install github.com/planetscale/vtprotobuf/cmd/protoc-gen-go-vtproto@v0.6.0
	@printf "\033[32m[+]\033[0m %s\n" "Done"


ifeq ($(OS),WINDOWS)
gen::
	@printf $(TITLE) "+" "Generating.."
	@./generate.sh
	@printf $(TITLE) "+" "Transforming.."
	@./transform.sh
	@printf $(TITLE) "+" "Done"
else ifeq ($(OS),MACOS)
gen::
	@printf $(TITLE) "+" "Generating.."
	@chmod +x generate.sh && ./generate.sh
	@printf $(TITLE) "+" "Transforming.."
	@chmod +x transform_mac.sh && ./transform_mac.sh
	@printf $(TITLE) "+" "Done"
else
gen::
	@printf $(TITLE) "+" "Generating.."
	@chmod +x generate.sh && ./generate.sh
	@printf $(TITLE) "+" "Transforming.."
	@chmod +x transform.sh && ./transform.sh
	@printf $(TITLE) "+" "Done"
endif

gen2:
	@printf $(TITLE) "+" "Generating.."
	@chmod +x generate2.sh && ./generate2.sh
	@printf $(TITLE) "+" "Transforming.."
	@chmod +x transform2.sh && ./transform2.sh
	@printf $(TITLE) "+" "Assembling.."
	@chmod +x assemble2.sh && ./assemble2.sh
	@printf $(TITLE) "+" "Done"


x:
	@printf "\033[32m[+]\033[0m %s\n" "Building protobuf contracts (zdk-pb)"
	@$(if $(filter $(OS),WINDOWS),cmd.exe /c,sh -c) "docker buildx build --target=export --output=type=local,dest=. -t zdk-pb:latest -f Dockerfile ."
	@printf "\033[32m[+]\033[0m %s\n" "Done"