## Running the project
### uses cases:
#### possibles arguments passing:
- java -jar go_euro.jar "City Name"
- java -jar go_euro.jar City Name

#### if the city name is not a correct key:
- generate JSON empty exception

#### if no arguments are passed
- generate badargumentsexception

### output:
- the csv file under the name **cityinfo.csv** is created in the root folder. if the csv file already exist, the new content is appended to it.

## Libraries used
- Appache HttpClient 4.5.2 GA
- jackson 1.9


