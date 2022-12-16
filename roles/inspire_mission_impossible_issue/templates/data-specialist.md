
![Mission](https://computate.neocities.org/png/rh-impact-logo-black-text-white-background-long.png "Hackathon Task for {{ PROJECT.title }}")

# {{ ISSUE_TITLE }}

{% if ISSUE.json[0].assignee.login is defined %}
## Agent {{ ISSUE.json[0].assignee.login }}: 

{% endif %}

Your mission, should you choose to accept it, is {{ ISSUE_MISSION }}. 

- You can import live {{ MODEL_NAME }} data if you can find it, or fake {{ MODEL_NAME }} data that your team can come up with (see the Example payloads below). 
- You could also reach out to existing {{ MODEL_NAME }} adopters, who are organizations who already work with these models. You may find some {{ MODEL_NAME }} adopters listed below. 
- Work with your visualization specialist to decide what kind of data will produce useful visualizations in the project. 
- You can import as much or as little {{ MODEL_NAME }} data as you wish, but enough to help your visualization specialist create nice visualizations of the data. 
- Work with your OpenShift deployment specialist to deploy the data to an Orion LD context broker, or [ follow the instructions to run FIWARE on your own OpenShift Local ] and deploy the {{ MODEL_NAME }} data on your own laptop. 
- Work with your documentation specialist to document some useful example data used in your project. 
- If you are not sure where obtain {{ MODEL_NAME }} data, you may want to use your imagination. Imagine if there was a {{ MODEL_NAME }} sensor in your actual city, or a {{ MODEL_NAME }} sensor in a small scale toy city that you could simulate. What kind of sensors could you use? How would you design such a simulation in an actual city or a toy city? How would you visualize {{ MODEL_NAME }} data in an actual city or a toy city? 

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
