package {{ CLASS_PACKAGE }};

/**
 * ContentType: text/plain
 * DisplayName.enUS: {{ FILE_RELATIVE_PATH }}
 * Map.hackathonLabel: {{ hackathonLabel }}
 * Map.hackathonMission: {{ hackathonMission }}
 * Map.hackathonTitle: {{ hackathonTitle }}
 * Map.hackathonColumn: {{ hackathonColumn }}
 * Map.hackathonLabels: {{ hackathonLabels }}
{% for NAME in NAMES %}
 * enUS: {{ NAME }}
{% endfor %}
 */
public class {{ CLASS_SIMPLE_NAME }} {
{% for PART in FILE_BODY.split('\n\n\n') %}

	/**
	 * DisplayName.enUS: {{ PART | regex_search('TODO: (.*)', '\\1') | default([], true) | first | default('create the code') }}
{% if loop.index == 1 %}
	 * enUS: Create a new file: {{ FILE_ABSOLUTE_PATH }}
	 * enUS: 
{% endif %}
	 * enUS: 
	 */
	public void part{{ loop.index }}() {
{% if loop.index > 1 %}
//
{% endif %}
{{ PART | regex_replace('(?m)^', '//') | regex_replace('TODO: ', '') | regex_replace('.*hackathon\w+: .*\n', '') }}
	}
{% endfor %}
}
