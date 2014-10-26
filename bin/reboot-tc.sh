#!/usr/bin/env /bin/bash
#
# bash script for rebooting tomcat within the CITE virtual machine,
# citevm
#

echo "Buidling war..."
/vagrant/bin/build-war.sh -c /vagrant/repositories/mss/confs/vm-servletconf.gradle -l /vagrant/repositories/mss/confs/vm-servletlinks.gradle -o /vagrant/repositories/mss/servlet


echo "Loading new war into tomcat ..."
/vagrant/bin/run-war.sh