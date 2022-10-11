# Setup the team19-hackathon-2021 project to setup Github project boards on MacOSX or Linux (Fedora, RHEL, CentOS)

## Install dependencies on Linux

```bash
sudo yum install -y git python3 python3-pip libselinux-python3 maven
```

## Install dependencies on MacOSX

For MacOS, install gnu-tar and add it to the system PATH  
https://stackoverflow.com/questions/54528115/unable-to-extract-tar-file-though-ansible-unarchive-module-in-macos

```bash
brew install git python maven gnu-tar
```

# Setup Ansible

## Install python3 dependencies for Ansible

```bash
sudo pip3 install psycopg2-binary ansible openshift jmespath
```

## Setup the directory for the project and clone the git repository into it 

```bash
sudo install -d -o $USER -g $USER /usr/local/src/team19-hackathon-2021
git clone git@github.com:team19hackathon2021/team19-hackathon-2021.git /usr/local/src/team19-hackathon-2021
```

## Run the Ansible playbook to generate the issues and project board in Github. 

```bash
cd /usr/local/src/team19-hackathon-2021
ansible-playbook -i inventories/inspire-2021/hosts --vault-id @prompt inspire_hackathon.yml
```

You can also filter generation of the issues by project: 

```bash
cd /usr/local/src/team19-hackathon-2021
ansible-playbook -i inventories/inspire-2021/hosts --vault-id @prompt inspire_hackathon.yml -e FILTER_PROJECT=Serratus
```

