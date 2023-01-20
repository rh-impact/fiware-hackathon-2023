
![Mission](https://computate.neocities.org/png/rh-impact-logo-black-text-white-background-long.png "Hackathon Task for {{ PROJECT.title }}")

# {{ ISSUE_TITLE }}

{% if ISSUE.json[0].assignee.login is defined %}
## Agent {{ ISSUE.json[0].assignee.login }}: 

{% endif %}

Your mission, should you choose to accept it, is {{ ISSUE_MISSION }}. 

## Walk through Youtube videos related to your task

These Youtube videos have been carefully prepared to help you with this data import task: 

- [Installing OpenShift Local for doing cloud computing on your personal computer!](https://youtu.be/8W8XniO1iCM)
- [Install a Hashicorp Vault on OpenShift Local to easily secure your GitOps](https://youtu.be/kyKORZ4B6qY)
- [Configure Vault token, policy, auth method, role, and secret to secure your GitOps](https://youtu.be/-sCdGAiKRA8)
- [Install ArgoCD on Openshift Local to monitor the state of your GitOps and Applications](https://youtu.be/9CScwEWyo_M)
- [Setup External Secret linked to Vault in OpenShift Local to keep your application passwords secure](https://youtu.be/91Yqz51i3xo)
- [Deploy ArgoCD Apps to OpenShift Local like MongoDB and the Orion LD Context Broker](https://youtu.be/Xa9MBnVpaCQ)

## More details about your task

- Deploy the [Orion LD Context Broker provided by FIWARE using these instructions](https://github.com/FIWARE-Ops/marinera/blob/main/documentation/LOCAL_MARINERA.md). 
- Work with your data specialist to import your {{ MODEL_NAME }} data into the FIWARE Context Broker running in your OpenShift Local environment. 
- Work with your visualization specialist to deploy visualization tools to your OpenShift Local environment. 
- Work with your documentation specialist to document the deployment of the OpenShift Local environment, the {{ MODEL_NAME }} data, and the visualization tools. 
- If you are not sure what kind of applications you could deploy to gather {{ MODEL_NAME }} data, you may want to use your imagination. Imagine if there was a {{ MODEL_NAME }} sensor in your actual city, or a {{ MODEL_NAME }} sensor in a small scale toy city that you could simulate. What kind of sensors could you use? How would you design such a simulation in an actual city or a toy city? How would you visualize {{ MODEL_NAME }} data in an actual city or a toy city? 
- To the `orion-ld` Deployment in the `fiware` namespace, I suggest adding an Environment Variable `ORIONLD_CORS_ALLOWED_ORIGIN` to `__ALL` so that the visualization specialist's application will be able to make requests to the Context Broker using JavaScript and AJAX. 

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
