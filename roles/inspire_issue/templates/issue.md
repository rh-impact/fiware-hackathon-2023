
![Hackathon Task for {{ PROJECT_NAME }}](https://github.com/team19hackathon2021/team19-hackathon-2021/raw/master/static/png/image.png "Hackathon Task for {{ PROJECT_NAME }}")

# {{ ANSIBLE_ISSUE.ISSUE_TITLE }}

## Hackathon Task for {{ PROJECT_NAME }}

{% if ANSIBLE_ISSUE.ISSUE_MISSION is defined %}
### Your mission should you choose to accept it: 

{{ ANSIBLE_ISSUE.ISSUE_MISSION }}

{% endif %}
{% if ANSIBLE_ISSUE.ISSUE_SKILLS is defined %}

### Suggested skills: 

{{ ANSIBLE_ISSUE.ISSUE_SKILLS }}

{% endif %}
{% if ANSIBLE_ISSUE.ISSUE_BODY is defined %}
### Task description: 

{{ ANSIBLE_ISSUE.ISSUE_BODY }}
{% endif %}
{% if ANSIBLE_ISSUE.ISSUE_EXAMPLE is defined %}
### Example: 

{{ ANSIBLE_ISSUE.ISSUE_EXAMPLE }}
{% endif %}
{% if ANSIBLE_ISSUE.ISSUE_EXAMPLE is defined or ANSIBLE_ISSUE.ISSUE_GITHUB is defined %}
# Additional Info

{% if ANSIBLE_ISSUE.ISSUE_GITHUB  | type_debug == 'list' %}
## The open source github code repositories: 

{% for GITHUB in ANSIBLE_ISSUE.ISSUE_GITHUB %}
- {{ GITHUB }}
{% endfor %}
{% else %}
## The open source github code repository: 

{{ ANSIBLE_ISSUE.ISSUE_GITHUB }}
{% endif %}
{% endif %}
