@echo off

set BASE=%cd%

java -Xms200m -Xmx500m -cp %BASE%\lib\*;%BASE%\bin de.tud.kom.p2psim.SimulatorRunner $1

pause