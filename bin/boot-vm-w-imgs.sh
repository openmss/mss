#!/usr/bin/env /bin/bash
#
# bash script for starting up system within the CITE virtual machine,
# citevm
#

/vagrant/bin/boot-cite.sh -m /vagrant/repositories/mss/confs/vm-mgrconf.gradle -c  /vagrant/repositories/mss/confs/vm-servletconf.gradle -l /vagrant/repositories/mss/confs/vm-servlet-w-img-links.gradle -o /vagrant/repositories/mss/servlet

