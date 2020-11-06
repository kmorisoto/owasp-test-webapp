# full scan

localではipアドレス指定が必要

```
docker run -v $(pwd):/zap/wrk/:rw -t owasp/zap2docker-stable zap-full-scan.py -t http://192.168.1.12:8080/hello -g owasp/gen.conf -r owasp/testreport.html
```

認証

```
docker run --rm -v $(pwd):/zap/wrk/:rw -t ictu/zap2docker-weekly zap-baseline.py -I -j -t http://192.168.1.12:8080 -r testreport.html --hook=/zap/auth_hook.py -z "auth.loginurl=http://192.168.1.12:8080/login/auth auth.username=nekoshima auth.password=password auth.auto=1"
```

```
docker run --rm -v $(pwd):/zap/wrk/:rw -t ictu/zap2docker-weekly zap-full-scan.py -I -j -t http://192.168.1.12:8080 -r testreport.html --hook=/zap/auth_hook.py -z "auth.loginurl=http://192.168.1.12:8080/login/auth auth.username=nekoshima auth.password=password auth.auto=1"
```

