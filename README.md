# loopr

This project emulates many end-users interacting with StockTrader 
via an external load balancer, such as an AWS Elastic LoadBalancer. It will:
* create a new portfolio for a randomly generated user
* Buy some shares (between 0-100) of a randomly selected stock
* Sell a random number of shares of said stock
* Delete the portfolio

There is a random amount of "think time" between each activity and there are page-navigation steps, included, too.

You can get creative and add additional buys/sell actions, more thinking time, additional actions, 
emulate different types of behavior by changing what is included in the `scenario`.


## Prerequisites for Mac
Install SDKMAN and SBT:
```shell
curl -s "https://get.sdkman.io" | bash 
sdk install scala
sdk install sbt
```

## Run the tool

```shell
git clone https://github.com/rtclauss/loopr.git
cd loopr
sbt clean GatlingIt/test -DpublicBaseEndpoint=https://a872f86d8b0b74adc9a6fb3568be2118-cb3a347684a3ce53.elb.us-east-2.amazonaws.com:9443
```
