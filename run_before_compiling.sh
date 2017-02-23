#! /bin/bash
echo "Copying keyboard file...."
cp -f ./keylayout/Generic.kl ../../../frameworks/base/data/keyboards/Generic.kl
echo "Making directories for missing components from CyanogenMod and LineageOS...."
mkdir -p ../../../out/target/product/tbltetmo/obj/lib
mkdir -p ../../../out/target/product/tbltetmo/obj/SHARED_LIBRARIES
mkdir -p ../../../out/target/common/obj/JAVA_LIBRARIES
mkdir -p ../../../hardware/qcom/media-caf
mkdir -p  ../../../hardware/qcom/media-caf/
mkdir -p  ../../../hardware/qcom/display-caf/
mkdir -p ../../../packages/resources/devicesettings/
echo "Copying missing components from CyanogenMod and LineageOS...."
cp -f ./extra/libqdutils.so.toc ../../../out/target/product/tbltetmo/obj/lib/libqdutils.so.toc
cp -f ./extra/libqdMetaData.so.toc ../../../out/target/product/tbltetmo/obj/lib/libqdMetaData.so.toc
cp -Ravf ./extra/libqdMetaData_intermediates ../../../out/target/product/tbltetmo/obj/SHARED_LIBRARIES/
cp -Ravf ./extra/libqdutils_intermediates ../../../out/target/product/tbltetmo/obj/SHARED_LIBRARIES/
cp -Ravf ./extra/org.cyanogenmod.platform.internal_intermediates ../../../out/target/common/obj/JAVA_LIBRARIES/
cp -Ravf ./extra/apq8084_1 ../../../hardware/qcom/media-caf/
mv ../../../hardware/qcom/media-caf/apq8084_1 ../../../hardware/qcom/media-caf/apq8084
cp -Ravf ./extra/apq8084_2 ../../../hardware/qcom/display-caf/
mv ../../../hardware/qcom/diaplay-caf/apq8084_2 ../../../hardware/qcom/display-caf/apq8084
cp -Ravf ./extra/res ../../../packages/resources/devicesettings/
echo "Done!"
exit 0


