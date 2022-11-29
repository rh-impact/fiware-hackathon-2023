
![Mission](https://computate.neocities.org/png/rh-impact-logo-black-text-white-background-long.png "Hackathon Task for {{ PROJECT.title }}")

# {{ ISSUE_TITLE }}

{% if ISSUE.json[0].assignee.login is defined %}
## Agent {{ ISSUE.json[0].assignee.login }}: 

{% endif %}

Your mission, should you choose to accept it, is {{ ISSUE_MISSION }}. 

- Work with your data specialist to come up with useful {{ MODEL_NAME }} data that you can use to visualize the work your team has done in the project. 
- You can import live {{ MODEL_NAME }} data if you can find it, or fake {{ MODEL_NAME }} data that your team can come up with (see the Example payloads below). 
- You can import as much or as little {{ MODEL_NAME }} data as you wish, but enough to help your visualization specialist create nice visualizations of the data. 
- Your data specialist will work with your OpenShift deployment specialist to deploy the data to an Orion LD context broker. You will use the provided data to build visualizations with the tools of your choice. They could be command line tools, or containerized applications that can be deployed to an OpenShift local environment, or local programs in a programming language that you choose that process the data in the Orion LD context broker, or any other way to choose to make your visualizations. 
- Work with your documentation specialist to document the visualizations you have built into the documentation of the project. 

## The day of the operation is Thursday February 2nd, 2023

{% if ISSUE.json[0].assignee.login is defined %}
Agent {{ ISSUE.json[0].assignee.login }}, you will have 4 hours to complete your mission. 
{% else %}
You will have 4 hours to complete your mission. 
{% endif %}

{{ PROJECT.shortDescription }}

## At the end of the day

Should you, or any of your force be taken or compromised that day, you must report back as many changes as you have made, and any knowledge of your actions, by pull request or comments on the issue on the board. 

## The details of your mission: 

{{ SMART_DATA_MODEL.MODEL_DOCUMENTATION }}

## {{ MODEL_NAME }} adopters

```
{{ SMART_DATA_MODEL.MODEL_ADOPTERS }}
```

![This message will not self-destruct. ](https://computate.neocities.org/png/mission-impossible-message.png "This message will not self-destruct. ")

# This message will not self destruct, because this project is open source. 
