package com.example.demo;


import org.springframework.web.bind.annotation.*;


@org.springframework.web.bind.annotation.RestController
@RequestMapping("/tekton")
public class RestController {

    @GetMapping("/hello")
    public String hello(){

        return "hello tekton";
    }

    public static void main(String[] args) {
        String str = "{\"level\":\"warn\",\"ts\":1574994468.460413,\"logger\":\"fallback-logger\",\"caller\":\"logging/config.go:69\",\"msg\":\"Fetch GitHub commit ID from kodata failed: \\\"ref: refs/heads/master\\\" is not a valid GitHub commit ID\"}\n" +
                "{\"level\":\"error\",\"ts\":1574994468.8115299,\"logger\":\"fallback-logger\",\"caller\":\"git/git.go:40\",\"msg\":\"Error running git [fetch --depth=1 --recurse-submodules=yes origin master]: exit status 128\\nremote: Password authentication is not available for Git operations.\\nremote: You must use a personal access token or SSH key.\\nremote: See https://github.ibm.com/settings/tokens or https://github.ibm.com/settings/ssh\\nfatal: unable to access 'https://github.ibm.com/Client-Vantage-Development/tekton-demo.git/': The requested URL returned error: 403\\n\",\"stacktrace\":\"github.com/tektoncd/pipeline/pkg/git.run\\n\\t/workspace/go/src/github.com/tektoncd/pipeline/pkg/git/git.go:40\\ngithub.com/tektoncd/pipeline/pkg/git.Fetch\\n\\t/workspace/go/src/github.com/tektoncd/pipeline/pkg/git/git.go:91\\nmain.main\\n\\t/workspace/go/src/github.com/tektoncd/pipeline/cmd/git-init/main.go:39\\nruntime.main\\n\\t/usr/local/go/src/runtime/proc.go:200\"}\n" +
                "{\"level\":\"error\",\"ts\":1574994469.1275268,\"logger\":\"fallback-logger\",\"caller\":\"git/git.go:40\",\"msg\":\"Error running git [pull --recurse-submodules=yes origin]: exit status 1\\nremote: Password authentication is not available for Git operations.\\nremote: You must use a personal access token or SSH key.\\nremote: See https://github.ibm.com/settings/tokens or https://github.ibm.com/settings/ssh\\nfatal: unable to access 'https://github.ibm.com/Client-Vantage-Development/tekton-demo.git/': The requested URL returned error: 403\\n\",\"stacktrace\":\"github.com/tektoncd/pipeline/pkg/git.run\\n\\t/workspace/go/src/github.com/tektoncd/pipeline/pkg/git/git.go:40\\ngithub.com/tektoncd/pipeline/pkg/git.Fetch\\n\\t/workspace/go/src/github.com/tektoncd/pipeline/pkg/git/git.go:94\\nmain.main\\n\\t/workspace/go/src/github.com/tektoncd/pipeline/cmd/git-init/main.go:39\\nruntime.main\\n\\t/usr/local/go/src/runtime/proc.go:200\"}\n" +
                "{\"level\":\"warn\",\"ts\":1574994469.1276772,\"logger\":\"fallback-logger\",\"caller\":\"git/git.go:95\",\"msg\":\"Failed to pull origin : exit status 1\"}\n" +
                "{\"level\":\"error\",\"ts\":1574994469.1298778,\"logger\":\"fallback-logger\",\"caller\":\"git/git.go:40\",\"msg\":\"Error running git [checkout master]: exit status 1\\nerror: pathspec 'master' did not match any file(s) known to git\\n\",\"stacktrace\":\"github.com/tektoncd/pipeline/pkg/git.run\\n\\t/workspace/go/src/github.com/tektoncd/pipeline/pkg/git/git.go:40\\ngithub.com/tektoncd/pipeline/pkg/git.Fetch\\n\\t/workspace/go/src/github.com/tektoncd/pipeline/pkg/git/git.go:97\\nmain.main\\n\\t/workspace/go/src/github.com/tektoncd/pipeline/cmd/git-init/main.go:39\\nruntime.main\\n\\t/usr/local/go/src/runtime/proc.go:200\"}\n" +
                "{\"level\":\"fatal\",\"ts\":1574994469.1299543,\"logger\":\"fallback-logger\",\"caller\":\"git-init/main.go:40\",\"msg\":\"Error fetching git repository: exit status 1\",\"stacktrace\":\"main.main\\n\\t/workspace/go/src/github.com/tektoncd/pipeline/cmd/git-init/main.go:40\\nruntime.main\\n\\t/usr/local/go/src/runtime/proc.go:200\"}";
        System.out.println(str);
    }
}
