
# Mission {{ ANSIBLE_ISSUE.ISSUE_TITLE }}

![Mission](https://github.com/team19hackathon2021/team19-hackathon-2021/raw/master/static/png/image.png "Hackathon Task for {{ ANSIBLE_PROJECT.PROJECT_NAME }}")

{% if ISSUE.json[0].assignee.login is defined %}
## Agent {{ ISSUE.json[0].assignee.login }}: 

{% endif %}

Your mission, should you choose to accept it, is {{ ANSIBLE_ISSUE.ISSUE_MISSION }}. 

## The day of the operation is October 26th, 2021

{% if ISSUE.json[0].assignee.login is defined %}
Agent {{ ISSUE.json[0].assignee.login }}, you will have 4 hours to complete your mission. 
{% else %}
You will have 4 hours to complete your mission. 
{% endif %}

{{ ANSIBLE_PROJECT.PROJECT_DESCRIPTION }}

# You will be joining a team of the boldest

of all Red Hatters for this mission, who will be at your service developing the code and automating the deployment to OpenShift. 

- Should you, or any of your force be taken or compromised that day, you must report back as many changes as you have made, and any knowledge of your actions, by pull request or comments on the issue on the board. 

## How to get started: 

Follow the instructions here to setup the project: {{ ANSIBLE_PROJECT.GITHUB_README }}

## The details of your mission: 

{% if JAVA_CLASS.classeTypeContenu_stored_string is not defined %}

- **The Java package name will be:** {{ JAVA_CLASS.classeNomEnsemble_enUS_stored_string }}
- **The Java class name will be:** {{ JAVA_CLASS.classeNomSimple_enUS_stored_string }}
- **The path to the Java class will be:** {{ JAVA_CLASS.classeChemin_enUS_stored_string }}
{% if JAVA_CLASS.classeNomSimpleSuper_enUS_stored_string != 'Object' %}
{% if JAVA_CLASS.classeNomSimpleSuperGenerique_enUS_stored_string is defined %}
- **The Java class will extend:** {{ JAVA_CLASS.classeNomSimpleSuper_enUS_stored_string }}\<{{ JAVA_CLASS.classeNomSimpleSuperGenerique_enUS_stored_string }}\>

{% elif JAVA_CLASS.classeNomSimpleSuper_enUS_stored_string is defined %}
- **The Java class will extend:** {{ JAVA_CLASS.classeNomSimpleSuper_enUS_stored_string }}
{% else %}
{% endif %}
{% endif %}

```java
package {{ JAVA_CLASS.classeNomEnsemble_enUS_stored_string }};

{% if JAVA_CLASS.classeImportations_enUS_stored_strings is defined %}
{% for CLASS_IMPORT in JAVA_CLASS.classeImportations_enUS_stored_strings %}
import {{ CLASS_IMPORT }};
{% endfor %}
{% endif %}

/**
{% if JAVA_CLASS.classeModele_stored_boolean == true %}
 * Model: true
{% endif %}
{% if JAVA_CLASS.classeApi_stored_boolean == true %}
 * Stored: true
{% endif %}
{% if JAVA_CLASS.classeIndexe_stored_boolean == true %}
 * Indexed: true
{% endif %}
{% if JAVA_CLASS.classeSauvegarde_stored_boolean == true %}
 * Saved: true
{% endif %}
{% if JAVA_CLASS.classeApiUri_enUS_stored_string is defined %}

 * ApiUri.enUS: {{ JAVA_CLASS.classeApiUri_enUS_stored_string }}
{% endif %}
{% if JAVA_CLASS.classeApiUri_enUS_stored_string is defined %}
 * ApiTag.enUS: {{ JAVA_CLASS.classeApiTag_enUS_stored_string }}
{% endif %}
{% if JAVA_CLASS.classeApiMethodes_enUS_stored_strings is defined and JAVA_CLASS.classeApiMethodes_enUS_stored_strings | length > 0 %}
{% for CLASS_API_METHOD in JAVA_CLASS.classeApiMethodes_enUS_stored_strings %}

{% if JAVA_CLASS['classeApiUri' ~ CLASS_API_METHOD ~ '_enUS_stored_string'] != JAVA_CLASS['classeApiUri_enUS_stored_string'] %}
 * ApiMethod: {{ CLASS_API_METHOD }}.enUS
 * ApiUri{{ CLASS_API_METHOD }}.enUS: {{ JAVA_CLASS['classeApiUri' ~ CLASS_API_METHOD ~ '_enUS_stored_string'] }}
{% else %}
 * ApiMethod: {{ CLASS_API_METHOD }}
{% endif %}
{% if JAVA_CLASS['classeRoleUtilisateur' ~ CLASS_API_METHOD ~ '_enUS_stored_boolean'] == true %}
 * RoleUtilisateur{{ CLASS_API_METHOD }}.enUS: true
{% endif %}
{% if JAVA_CLASS['classePageNomSimple' ~ CLASS_API_METHOD ~ '_enUS_stored_string'] is defined %}
 * Page{{ CLASS_API_METHOD }}.enUS: {{ JAVA_CLASS['classePageNomSimple' ~ CLASS_API_METHOD ~ '_enUS_stored_string'] }}
{% endif %}
{% if JAVA_CLASS['classePageSuperNomSimple' ~ CLASS_API_METHOD ~ '_enUS_stored_string'] is defined %}
 * PageSuper{{ CLASS_API_METHOD }}.enUS: {{ JAVA_CLASS['classePageNomSimple' ~ CLASS_API_METHOD ~ '_enUS_stored_string'] }}
{% endif %}
{% endfor %}
{% endif %}
{% if JAVA_CLASS.contexteUnNom_enUS_stored_string is defined %}

 * AName.enUS: {{ JAVA_CLASS.contexteUnNom_enUS_stored_string | default('') }}
 * Color: {{ JAVA_CLASS.contexteCouleur_stored_string | default('') }}
 * IconGroup: {{ JAVA_CLASS.contexteIconeGroupe_stored_string | default('') }}
 * IconName: {{ JAVA_CLASS.contexteIconeNom_stored_string | default('') }}
 * NameVar: {{ JAVA_CLASS.contexteNomVar_enUS_stored_string | default('') }}
{% endif %}
{% if JAVA_CLASS.classeRoles_enUS_stored_strings is defined and JAVA_CLASS.classeRoles_enUS_stored_strings | length > 0 %}

{% for CLASS_ROLE in JAVA_CLASS.classeRoles_enUS_stored_strings %}
 * Role.enUS: {{ CLASS_ROLE }}
{% endfor %}
{% if JAVA_CLASS.classePublicLire_stored_boolean == true %}
 * PublicRead: true
{% endif %}
{% if JAVA_CLASS.classeRoleSession_stored_boolean == true %}
 * RoleSession: true
{% endif %}
{% if JAVA_CLASS.classeRoleUtilisteur_stored_boolean == true %}
 * RoleUser: true
{% endif %}
{% endif %}
{% if JAVA_CLASS.classeTrisTrouves_stored_boolean == true %}

{% for i in range(JAVA_CLASS.classeTrisVar_enUS_stored_strings | length) %}
 * Sort.{{ JAVA_CLASS['classeTrisOrdre_stored_strings'][i] }}: {{ JAVA_CLASS['classeTrisVar_enUS_stored_strings'][i] }}
{% endfor %}
{% endif %}
{% if JAVA_CLASS.contexteRows_stored_int is defined %}

 * Rows: {{ JAVA_CLASS.contexteRows_stored_int }}
{% endif %}
 **/

public{% if JAVA_CLASS.classeEstAbstrait_stored_boolean == true %} abstract{% endif %} class {{ JAVA_CLASS.classeNomSimple_enUS_stored_string }}{% if JAVA_CLASS.classeNomSimpleSuper_enUS_stored_string is defined and JAVA_CLASS.classeNomSimpleSuper_enUS_stored_string != 'Object' %} extends {{ JAVA_CLASS.classeNomSimpleSuper_enUS_stored_string }}{% if JAVA_CLASS.classeNomSimpleSuperGenerique_enUS_stored_string is defined %}<{{ JAVA_CLASS.classeNomSimpleSuperGenerique_enUS_stored_string }}>{% endif %}{% endif %} {
}
```

{% endif %}

{% for CLASS_PART in CLASS_PARTS_JSON.json.response.docs %}

{% if CLASS_PART.partEstEntite_stored_boolean is defined %}
## Create the init method for the {{ CLASS_PART.entiteVar_enUS_stored_string }} field inside the {{ JAVA_CLASS.classeNomSimple_enUS_stored_string }} class

Create an initialization method that starts with an underscore (_){{ CLASS_PART.entiteVar_enUS_stored_string }} to define the  {{ CLASS_PART.entiteVar_enUS_stored_string }} field
{% if CLASS_PART.entiteCommentaire_enUS_stored_string is defined %}

{{ CLASS_PART.entiteCommentaire_enUS_stored_string | regex_replace('{([{%])', '\\{\\\\\\1') | regex_replace('([}%])}', '\\\\\\1\\}') }}
{% endif %}

Here is a suggestion on what the code might look like: 

```java
{% if CLASS_PART.entiteCouverture_stored_boolean %}
	protected void _{{ CLASS_PART.entiteVar_enUS_stored_string }}(Wrap<{{ CLASS_PART.entiteNomSimpleComplet_enUS_stored_string }}> {{ CLASS_PART.entiteVarParam_enUS_stored_string }}) {% raw %}{{% endraw %}{{ CLASS_PART.entiteCodeSource_enUS_stored_string | default('') }}{% raw %}}{% endraw %}
{% else %}
protected void _{{ CLASS_PART.entiteVar_enUS_stored_string }}({{ CLASS_PART.entiteNomSimpleComplet_enUS_stored_string }} {{ CLASS_PART.entiteVarParam_enUS_stored_string }}) {% raw %}{{% endraw %}{{ CLASS_PART.entiteCodeSource_enUS_stored_string | default('') }}{% raw %}}{% endraw %}
{% endif %}

```
{% elif CLASS_PART.partEstMethode_stored_boolean is defined %}
{% if JAVA_CLASS.classeTypeContenu_stored_string is defined %}
## {{ CLASS_PART.methodeNomAffichage_enUS_stored_string }}
{% else %}
## Create the {{ CLASS_PART.methodeVar_enUS_stored_string }} method inside the {{ JAVA_CLASS.classeNomSimple_enUS_stored_string }} class
{% endif %}
{% if CLASS_PART.methodeCommentaire_enUS_stored_string is defined %}

{{ CLASS_PART.methodeCommentaire_enUS_stored_string | regex_replace('{{#', '\\{\\{\\#') | regex_replace('{([{%])', '\\{\\\\\\1') | regex_replace('([}%])}', '\\\\\\1\\}') }}
{% endif %}

{% if JAVA_CLASS.classeTypeContenu_stored_string is not defined %}
```java
	{%if CLASS_PART.methodeEstPublic_stored_boolean %}public {% endif %}{%if CLASS_PART.methodeEstProtege_stored_boolean %}protected {% endif %}{%if CLASS_PART.methodeEstPrive_stored_boolean %}private {% endif %}{%if CLASS_PART.methodeEstStatique_stored_boolean %}static {% endif %}{%if CLASS_PART.methodeEstFinale_stored_boolean %}final {% endif %}{%if CLASS_PART.methodeEstAbstrait_stored_boolean %}abstract {% endif %}{%if CLASS_PART.methodeEstVide_stored_boolean %}void {% else %}{{ CLASS_PART.methodeRetourNomSimpleComplet_enUS_stored_string }} {% endif %}{{ CLASS_PART.methodeVar_enUS_stored_string }}({% if CLASS_PART.methodeParamsVar_enUS_stored_strings is defined %}{% for i in range( CLASS_PART.methodeParamsVar_enUS_stored_strings | length ) %}{% if i > 0 %}, {% endif %}{{ CLASS_PART.methodeParamsNomSimpleComplet_enUS_stored_strings[i] }}{% if CLASS_PART.methodeParamsArgsVariables_stored_booleans[i] == true %}...{% else %} {% endif %}{{ CLASS_PART.methodeParamsVar_enUS_stored_strings[i] }}{% endfor %}{% endif %}) {% raw %}{{% endraw %}{{ CLASS_PART.methodeCodeSource_enUS_stored_string | default('') }}{% raw %}}{% endraw %}

```
{% else %}
```{{ JAVA_CLASS.classeTypeContenu_stored_string | regex_replace('.*/', '') }}
{{ CLASS_PART.methodeCodeSource_enUS_stored_string | default('') | regex_replace('{{#', '\\{\\{\\#') | regex_replace('{([{%])', '\\{\\\\\\1') | regex_replace('([}%])}', '\\\\\\1\\}') }}
```
{% endif %}
{% elif CLASS_PART.partEstChamp_stored_boolean is defined %}
## Create the {{ CLASS_PART.champVar_enUS_stored_string }} field inside the {{ JAVA_CLASS.classeNomSimple_enUS_stored_string }} class
{% if CLASS_PART.champCommentaire_enUS_stored_string is defined %}

{{ CLASS_PART.champCommentaire_enUS_stored_string | regex_replace('{{#', '\\{\\{\\#') | regex_replace('{([{%])', '\\{\\\\\\1') | regex_replace('([}%])}', '\\\\\\1\\}') }}
{% endif %}

```java
{% if CLASS_PART.champCodeSource_enUS_stored_string is defined %}
	{%if CLASS_PART.champEstPublic_stored_boolean %}public {% endif %}{%if CLASS_PART.champEstProtege_stored_boolean %}protected {% endif %}{%if CLASS_PART.champEstPrive_stored_boolean %}private {% endif %}{%if CLASS_PART.champEstStatique_stored_boolean %}static {% endif %}{%if CLASS_PART.champEstFinale_stored_boolean %}final {% endif %}{%if CLASS_PART.champEstAbstrait_stored_boolean %}abstract {% endif %}{{ CLASS_PART.champNomSimpleComplet_enUS_stored_string }} {{ CLASS_PART.champVar_enUS_stored_string }} = {{ CLASS_PART.champCodeSource_enUS_stored_string }};
{% else %}
	{%if CLASS_PART.champEstPublic_stored_boolean %}public {% endif %}{%if CLASS_PART.champEstProtege_stored_boolean %}protected {% endif %}{%if CLASS_PART.champEstPrive_stored_boolean %}private {% endif %}{%if CLASS_PART.champEstStatique_stored_boolean %}static {% endif %}{%if CLASS_PART.champEstFinale_stored_boolean %}final {% endif %}{%if CLASS_PART.champEstAbstrait_stored_boolean %}abstract {% endif %}{{ CLASS_PART.champNomSimpleComplet_enUS_stored_string }} {{ CLASS_PART.champVar_enUS_stored_string }};
{% endif %}
```
{% endif %}
{% endfor %}

![This message will not self-destruct. ](https://computate.neocities.org/png/mission-impossible-message.png "This message will not self-destruct. ")

# This message will not self destruct, because this project is open source. 
