# travis-kotlin

What this Travis CI build does: 

* Grabs Pinterest's https://github.com/pinterest/ktlint
* Run the linter
* If you want to run the linter on sample directories, add this into your `.travis.yml`:
  
```yaml
- |
    for DIR in ./*/; do
      pushd $DIR
      ./gradlew test
      popd
    done
```
At the end of this `.travis.yml`. 
