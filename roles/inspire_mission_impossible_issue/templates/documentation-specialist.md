
![Mission](https://computate.neocities.org/png/rh-impact-logo-black-text-white-background-long.png "Hackathon Task for {{ PROJECT.title }}")

# {{ ISSUE_TITLE }}

{% if ISSUE.json[0].assignee.login is defined %}
## Agent {{ ISSUE.json[0].assignee.login }}: 

{% endif %}

Your mission, should you choose to accept it, is {{ ISSUE_MISSION }}. 

- Setup a `Fiware{{ MODEL_NAME }}` repository for your team's project inside the [`rh-impact` Github Organization here](https://github.com/orgs/rh-impact/repositories). 
- Create a README.md in the root directory of your repository, and any other documentation files you see useful inside a subdirectory. 
- Work with your deployment specialist to document the installation of OpenShift Local. 
- Work with your data specialist to document how to import your {{ MODEL_NAME }} data into the FIWARE Context Broker. 
- Work with your visualization specialist to document the deployment visualization tools to your OpenShift Local environment. 
- Document how to visualize your data using your tools. 
- Add any screenshots, videos or other visualizations you come up with to enhance your team's accomplishments. 
- If you are not sure where obtain or how to visualize {{ MODEL_NAME }} data, you may want to use your imagination. Imagine if there was a {{ MODEL_NAME }} sensor in your actual city, or a {{ MODEL_NAME }} sensor in a small scale toy city that you could simulate. What kind of sensors could you use? How would you design such a simulation in an actual city or a toy city? How would you visualize {{ MODEL_NAME }} data in an actual city or a toy city? 

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
