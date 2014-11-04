#!/usr/bin/env /bin/bash
#
# bash script for rebuilding project graph and restaring fuseki
# with the CITE virtual machine, citevm
#

/vagrant/bin/build-ttl.sh /vagrant/repositories/mss/confs/vm-mgrconf.gradle
/vagrant/bin/load-ttl.sh

