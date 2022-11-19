
# Mission {{ ISSUE_TITLE }}

![Mission](https://github.com/team19hackathon2021/team19-hackathon-2021/raw/master/static/png/image.png "Hackathon Task for {{ PROJECT.title }}")

{% if ISSUE.json[0].assignee.login is defined %}
## Agent {{ ISSUE.json[0].assignee.login }}: 

{% endif %}

Your mission, should you choose to accept it, is {{ ISSUE_MISSION }}. 

## The day of the operation is Thursday February 2nd, 2023

{% if ISSUE.json[0].assignee.login is defined %}
Agent {{ ISSUE.json[0].assignee.login }}, you will have 4 hours to complete your mission. 
{% else %}
You will have 4 hours to complete your mission. 
{% endif %}

{{ PROJECT.shortDescription }}

# You will be joining a team of the boldest

of all Red Hatters for this mission, who will be at your service developing the code and automating the deployment to OpenShift. 

- Should you, or any of your force be taken or compromised that day, you must report back as many changes as you have made, and any knowledge of your actions, by pull request or comments on the issue on the board. 

## How to get started: 

Follow the instructions here to setup the project: {{ ANSIBLE_PROJECT.GITHUB_README }}

## The details of your mission: 

{{ SMART_DATA_MODEL.MODEL_DOCUMENTATION }}

![This message will not self-destruct. ](https://computate.neocities.org/png/mission-impossible-message.png "This message will not self-destruct. ")

# This message will not self destruct, because this project is open source. 
