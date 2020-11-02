# full scan

localではipアドレス指定が必要

```
docker run -v $(pwd):/zap/wrk/:rw -t owasp/zap2docker-stable zap-full-scan.py -t http://192.168.1.12:8080/hello -g owasp/gen.conf -r owasp/testreport.html
```
