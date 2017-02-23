/*
 * This file is auto-generated.  DO NOT MODIFY.
 * Original file: vendor/cmsdk/sdk/src/java/cyanogenmod/hardware/ICMHardwareService.aidl
 */
package cyanogenmod.hardware;
/** @hide */
public interface ICMHardwareService extends android.os.IInterface
{
/** No-Op implementation  */
/** @hide */
public static class NoOp implements cyanogenmod.hardware.ICMHardwareService
{
@Override public android.os.IBinder asBinder()
{
return null;
}
@Override public int getSupportedFeatures() throws android.os.RemoteException
{
return 0;
}
@Override public boolean get(int feature) throws android.os.RemoteException
{
return false;
}
@Override public boolean set(int feature, boolean enable) throws android.os.RemoteException
{
return false;
}
@Override public int[] getDisplayColorCalibration() throws android.os.RemoteException
{
return null;
}
@Override public boolean setDisplayColorCalibration(int[] rgb) throws android.os.RemoteException
{
return false;
}
@Override public int getNumGammaControls() throws android.os.RemoteException
{
return 0;
}
@Override public int[] getDisplayGammaCalibration(int idx) throws android.os.RemoteException
{
return null;
}
@Override public boolean setDisplayGammaCalibration(int idx, int[] rgb) throws android.os.RemoteException
{
return false;
}
@Override public int[] getVibratorIntensity() throws android.os.RemoteException
{
return null;
}
@Override public boolean setVibratorIntensity(int intensity) throws android.os.RemoteException
{
return false;
}
@Override public java.lang.String getLtoSource() throws android.os.RemoteException
{
return null;
}
@Override public java.lang.String getLtoDestination() throws android.os.RemoteException
{
return null;
}
@Override public long getLtoDownloadInterval() throws android.os.RemoteException
{
return 0;
}
@Override public java.lang.String getSerialNumber() throws android.os.RemoteException
{
return null;
}
@Override public boolean requireAdaptiveBacklightForSunlightEnhancement() throws android.os.RemoteException
{
return false;
}
@Override public cyanogenmod.hardware.DisplayMode[] getDisplayModes() throws android.os.RemoteException
{
return null;
}
@Override public cyanogenmod.hardware.DisplayMode getCurrentDisplayMode() throws android.os.RemoteException
{
return null;
}
@Override public cyanogenmod.hardware.DisplayMode getDefaultDisplayMode() throws android.os.RemoteException
{
return null;
}
@Override public boolean setDisplayMode(cyanogenmod.hardware.DisplayMode mode, boolean makeDefault) throws android.os.RemoteException
{
return false;
}
@Override public boolean writePersistentBytes(java.lang.String key, byte[] bytes) throws android.os.RemoteException
{
return false;
}
@Override public byte[] readPersistentBytes(java.lang.String key) throws android.os.RemoteException
{
return null;
}
@Override public int getThermalState() throws android.os.RemoteException
{
return 0;
}
@Override public boolean registerThermalListener(cyanogenmod.hardware.IThermalListenerCallback callback) throws android.os.RemoteException
{
return false;
}
@Override public boolean unRegisterThermalListener(cyanogenmod.hardware.IThermalListenerCallback callback) throws android.os.RemoteException
{
return false;
}
@Override public boolean isSunlightEnhancementSelfManaged() throws android.os.RemoteException
{
return false;
}
@Override public java.lang.String getUniqueDeviceId() throws android.os.RemoteException
{
return null;
}
@Override public int getColorBalanceMin() throws android.os.RemoteException
{
return 0;
}
@Override public int getColorBalanceMax() throws android.os.RemoteException
{
return 0;
}
@Override public int getColorBalance() throws android.os.RemoteException
{
return 0;
}
@Override public boolean setColorBalance(int value) throws android.os.RemoteException
{
return false;
}
@Override public cyanogenmod.hardware.HSIC getPictureAdjustment() throws android.os.RemoteException
{
return null;
}
@Override public cyanogenmod.hardware.HSIC getDefaultPictureAdjustment() throws android.os.RemoteException
{
return null;
}
@Override public boolean setPictureAdjustment(cyanogenmod.hardware.HSIC hsic) throws android.os.RemoteException
{
return false;
}
@Override public float[] getPictureAdjustmentRanges() throws android.os.RemoteException
{
return null;
}
}
/** Local-side IPC implementation stub class. */
public static abstract class Stub extends android.os.Binder implements cyanogenmod.hardware.ICMHardwareService
{
private static final java.lang.String DESCRIPTOR = "cyanogenmod.hardware.ICMHardwareService";
/** Construct the stub at attach it to the interface. */
public Stub()
{
this.attachInterface(this, DESCRIPTOR);
}
/**
 * Cast an IBinder object into an cyanogenmod.hardware.ICMHardwareService interface,
 * generating a proxy if needed.
 */
public static cyanogenmod.hardware.ICMHardwareService asInterface(android.os.IBinder obj)
{
if ((obj==null)) {
return null;
}
android.os.IInterface iin = obj.queryLocalInterface(DESCRIPTOR);
if (((iin!=null)&&(iin instanceof cyanogenmod.hardware.ICMHardwareService))) {
return ((cyanogenmod.hardware.ICMHardwareService)iin);
}
return new cyanogenmod.hardware.ICMHardwareService.Stub.Proxy(obj);
}
@Override public android.os.IBinder asBinder()
{
return this;
}
@Override public boolean onTransact(int code, android.os.Parcel data, android.os.Parcel reply, int flags) throws android.os.RemoteException
{
switch (code)
{
case INTERFACE_TRANSACTION:
{
reply.writeString(DESCRIPTOR);
return true;
}
case TRANSACTION_getSupportedFeatures:
{
data.enforceInterface(DESCRIPTOR);
int _result = this.getSupportedFeatures();
reply.writeNoException();
reply.writeInt(_result);
return true;
}
case TRANSACTION_get:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
boolean _result = this.get(_arg0);
reply.writeNoException();
reply.writeInt(((_result)?(1):(0)));
return true;
}
case TRANSACTION_set:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
boolean _arg1;
_arg1 = (0!=data.readInt());
boolean _result = this.set(_arg0, _arg1);
reply.writeNoException();
reply.writeInt(((_result)?(1):(0)));
return true;
}
case TRANSACTION_getDisplayColorCalibration:
{
data.enforceInterface(DESCRIPTOR);
int[] _result = this.getDisplayColorCalibration();
reply.writeNoException();
reply.writeIntArray(_result);
return true;
}
case TRANSACTION_setDisplayColorCalibration:
{
data.enforceInterface(DESCRIPTOR);
int[] _arg0;
_arg0 = data.createIntArray();
boolean _result = this.setDisplayColorCalibration(_arg0);
reply.writeNoException();
reply.writeInt(((_result)?(1):(0)));
return true;
}
case TRANSACTION_getNumGammaControls:
{
data.enforceInterface(DESCRIPTOR);
int _result = this.getNumGammaControls();
reply.writeNoException();
reply.writeInt(_result);
return true;
}
case TRANSACTION_getDisplayGammaCalibration:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
int[] _result = this.getDisplayGammaCalibration(_arg0);
reply.writeNoException();
reply.writeIntArray(_result);
return true;
}
case TRANSACTION_setDisplayGammaCalibration:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
int[] _arg1;
_arg1 = data.createIntArray();
boolean _result = this.setDisplayGammaCalibration(_arg0, _arg1);
reply.writeNoException();
reply.writeInt(((_result)?(1):(0)));
return true;
}
case TRANSACTION_getVibratorIntensity:
{
data.enforceInterface(DESCRIPTOR);
int[] _result = this.getVibratorIntensity();
reply.writeNoException();
reply.writeIntArray(_result);
return true;
}
case TRANSACTION_setVibratorIntensity:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
boolean _result = this.setVibratorIntensity(_arg0);
reply.writeNoException();
reply.writeInt(((_result)?(1):(0)));
return true;
}
case TRANSACTION_getLtoSource:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _result = this.getLtoSource();
reply.writeNoException();
reply.writeString(_result);
return true;
}
case TRANSACTION_getLtoDestination:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _result = this.getLtoDestination();
reply.writeNoException();
reply.writeString(_result);
return true;
}
case TRANSACTION_getLtoDownloadInterval:
{
data.enforceInterface(DESCRIPTOR);
long _result = this.getLtoDownloadInterval();
reply.writeNoException();
reply.writeLong(_result);
return true;
}
case TRANSACTION_getSerialNumber:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _result = this.getSerialNumber();
reply.writeNoException();
reply.writeString(_result);
return true;
}
case TRANSACTION_requireAdaptiveBacklightForSunlightEnhancement:
{
data.enforceInterface(DESCRIPTOR);
boolean _result = this.requireAdaptiveBacklightForSunlightEnhancement();
reply.writeNoException();
reply.writeInt(((_result)?(1):(0)));
return true;
}
case TRANSACTION_getDisplayModes:
{
data.enforceInterface(DESCRIPTOR);
cyanogenmod.hardware.DisplayMode[] _result = this.getDisplayModes();
reply.writeNoException();
reply.writeTypedArray(_result, android.os.Parcelable.PARCELABLE_WRITE_RETURN_VALUE);
return true;
}
case TRANSACTION_getCurrentDisplayMode:
{
data.enforceInterface(DESCRIPTOR);
cyanogenmod.hardware.DisplayMode _result = this.getCurrentDisplayMode();
reply.writeNoException();
if ((_result!=null)) {
reply.writeInt(1);
_result.writeToParcel(reply, android.os.Parcelable.PARCELABLE_WRITE_RETURN_VALUE);
}
else {
reply.writeInt(0);
}
return true;
}
case TRANSACTION_getDefaultDisplayMode:
{
data.enforceInterface(DESCRIPTOR);
cyanogenmod.hardware.DisplayMode _result = this.getDefaultDisplayMode();
reply.writeNoException();
if ((_result!=null)) {
reply.writeInt(1);
_result.writeToParcel(reply, android.os.Parcelable.PARCELABLE_WRITE_RETURN_VALUE);
}
else {
reply.writeInt(0);
}
return true;
}
case TRANSACTION_setDisplayMode:
{
data.enforceInterface(DESCRIPTOR);
cyanogenmod.hardware.DisplayMode _arg0;
if ((0!=data.readInt())) {
_arg0 = cyanogenmod.hardware.DisplayMode.CREATOR.createFromParcel(data);
}
else {
_arg0 = null;
}
boolean _arg1;
_arg1 = (0!=data.readInt());
boolean _result = this.setDisplayMode(_arg0, _arg1);
reply.writeNoException();
reply.writeInt(((_result)?(1):(0)));
return true;
}
case TRANSACTION_writePersistentBytes:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _arg0;
_arg0 = data.readString();
byte[] _arg1;
_arg1 = data.createByteArray();
boolean _result = this.writePersistentBytes(_arg0, _arg1);
reply.writeNoException();
reply.writeInt(((_result)?(1):(0)));
return true;
}
case TRANSACTION_readPersistentBytes:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _arg0;
_arg0 = data.readString();
byte[] _result = this.readPersistentBytes(_arg0);
reply.writeNoException();
reply.writeByteArray(_result);
return true;
}
case TRANSACTION_getThermalState:
{
data.enforceInterface(DESCRIPTOR);
int _result = this.getThermalState();
reply.writeNoException();
reply.writeInt(_result);
return true;
}
case TRANSACTION_registerThermalListener:
{
data.enforceInterface(DESCRIPTOR);
cyanogenmod.hardware.IThermalListenerCallback _arg0;
_arg0 = cyanogenmod.hardware.IThermalListenerCallback.Stub.asInterface(data.readStrongBinder());
boolean _result = this.registerThermalListener(_arg0);
reply.writeNoException();
reply.writeInt(((_result)?(1):(0)));
return true;
}
case TRANSACTION_unRegisterThermalListener:
{
data.enforceInterface(DESCRIPTOR);
cyanogenmod.hardware.IThermalListenerCallback _arg0;
_arg0 = cyanogenmod.hardware.IThermalListenerCallback.Stub.asInterface(data.readStrongBinder());
boolean _result = this.unRegisterThermalListener(_arg0);
reply.writeNoException();
reply.writeInt(((_result)?(1):(0)));
return true;
}
case TRANSACTION_isSunlightEnhancementSelfManaged:
{
data.enforceInterface(DESCRIPTOR);
boolean _result = this.isSunlightEnhancementSelfManaged();
reply.writeNoException();
reply.writeInt(((_result)?(1):(0)));
return true;
}
case TRANSACTION_getUniqueDeviceId:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _result = this.getUniqueDeviceId();
reply.writeNoException();
reply.writeString(_result);
return true;
}
case TRANSACTION_getColorBalanceMin:
{
data.enforceInterface(DESCRIPTOR);
int _result = this.getColorBalanceMin();
reply.writeNoException();
reply.writeInt(_result);
return true;
}
case TRANSACTION_getColorBalanceMax:
{
data.enforceInterface(DESCRIPTOR);
int _result = this.getColorBalanceMax();
reply.writeNoException();
reply.writeInt(_result);
return true;
}
case TRANSACTION_getColorBalance:
{
data.enforceInterface(DESCRIPTOR);
int _result = this.getColorBalance();
reply.writeNoException();
reply.writeInt(_result);
return true;
}
case TRANSACTION_setColorBalance:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
boolean _result = this.setColorBalance(_arg0);
reply.writeNoException();
reply.writeInt(((_result)?(1):(0)));
return true;
}
case TRANSACTION_getPictureAdjustment:
{
data.enforceInterface(DESCRIPTOR);
cyanogenmod.hardware.HSIC _result = this.getPictureAdjustment();
reply.writeNoException();
if ((_result!=null)) {
reply.writeInt(1);
_result.writeToParcel(reply, android.os.Parcelable.PARCELABLE_WRITE_RETURN_VALUE);
}
else {
reply.writeInt(0);
}
return true;
}
case TRANSACTION_getDefaultPictureAdjustment:
{
data.enforceInterface(DESCRIPTOR);
cyanogenmod.hardware.HSIC _result = this.getDefaultPictureAdjustment();
reply.writeNoException();
if ((_result!=null)) {
reply.writeInt(1);
_result.writeToParcel(reply, android.os.Parcelable.PARCELABLE_WRITE_RETURN_VALUE);
}
else {
reply.writeInt(0);
}
return true;
}
case TRANSACTION_setPictureAdjustment:
{
data.enforceInterface(DESCRIPTOR);
cyanogenmod.hardware.HSIC _arg0;
if ((0!=data.readInt())) {
_arg0 = cyanogenmod.hardware.HSIC.CREATOR.createFromParcel(data);
}
else {
_arg0 = null;
}
boolean _result = this.setPictureAdjustment(_arg0);
reply.writeNoException();
reply.writeInt(((_result)?(1):(0)));
return true;
}
case TRANSACTION_getPictureAdjustmentRanges:
{
data.enforceInterface(DESCRIPTOR);
float[] _result = this.getPictureAdjustmentRanges();
reply.writeNoException();
reply.writeFloatArray(_result);
return true;
}
}
return super.onTransact(code, data, reply, flags);
}
private static class Proxy implements cyanogenmod.hardware.ICMHardwareService
{
private android.os.IBinder mRemote;
Proxy(android.os.IBinder remote)
{
mRemote = remote;
}
@Override public android.os.IBinder asBinder()
{
return mRemote;
}
public java.lang.String getInterfaceDescriptor()
{
return DESCRIPTOR;
}
@Override public int getSupportedFeatures() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
int _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_getSupportedFeatures, _data, _reply, 0);
_reply.readException();
_result = _reply.readInt();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public boolean get(int feature) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
boolean _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(feature);
mRemote.transact(Stub.TRANSACTION_get, _data, _reply, 0);
_reply.readException();
_result = (0!=_reply.readInt());
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public boolean set(int feature, boolean enable) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
boolean _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(feature);
_data.writeInt(((enable)?(1):(0)));
mRemote.transact(Stub.TRANSACTION_set, _data, _reply, 0);
_reply.readException();
_result = (0!=_reply.readInt());
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public int[] getDisplayColorCalibration() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
int[] _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_getDisplayColorCalibration, _data, _reply, 0);
_reply.readException();
_result = _reply.createIntArray();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public boolean setDisplayColorCalibration(int[] rgb) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
boolean _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeIntArray(rgb);
mRemote.transact(Stub.TRANSACTION_setDisplayColorCalibration, _data, _reply, 0);
_reply.readException();
_result = (0!=_reply.readInt());
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public int getNumGammaControls() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
int _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_getNumGammaControls, _data, _reply, 0);
_reply.readException();
_result = _reply.readInt();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public int[] getDisplayGammaCalibration(int idx) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
int[] _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(idx);
mRemote.transact(Stub.TRANSACTION_getDisplayGammaCalibration, _data, _reply, 0);
_reply.readException();
_result = _reply.createIntArray();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public boolean setDisplayGammaCalibration(int idx, int[] rgb) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
boolean _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(idx);
_data.writeIntArray(rgb);
mRemote.transact(Stub.TRANSACTION_setDisplayGammaCalibration, _data, _reply, 0);
_reply.readException();
_result = (0!=_reply.readInt());
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public int[] getVibratorIntensity() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
int[] _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_getVibratorIntensity, _data, _reply, 0);
_reply.readException();
_result = _reply.createIntArray();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public boolean setVibratorIntensity(int intensity) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
boolean _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(intensity);
mRemote.transact(Stub.TRANSACTION_setVibratorIntensity, _data, _reply, 0);
_reply.readException();
_result = (0!=_reply.readInt());
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public java.lang.String getLtoSource() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
java.lang.String _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_getLtoSource, _data, _reply, 0);
_reply.readException();
_result = _reply.readString();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public java.lang.String getLtoDestination() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
java.lang.String _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_getLtoDestination, _data, _reply, 0);
_reply.readException();
_result = _reply.readString();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public long getLtoDownloadInterval() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
long _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_getLtoDownloadInterval, _data, _reply, 0);
_reply.readException();
_result = _reply.readLong();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public java.lang.String getSerialNumber() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
java.lang.String _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_getSerialNumber, _data, _reply, 0);
_reply.readException();
_result = _reply.readString();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public boolean requireAdaptiveBacklightForSunlightEnhancement() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
boolean _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_requireAdaptiveBacklightForSunlightEnhancement, _data, _reply, 0);
_reply.readException();
_result = (0!=_reply.readInt());
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public cyanogenmod.hardware.DisplayMode[] getDisplayModes() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
cyanogenmod.hardware.DisplayMode[] _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_getDisplayModes, _data, _reply, 0);
_reply.readException();
_result = _reply.createTypedArray(cyanogenmod.hardware.DisplayMode.CREATOR);
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public cyanogenmod.hardware.DisplayMode getCurrentDisplayMode() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
cyanogenmod.hardware.DisplayMode _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_getCurrentDisplayMode, _data, _reply, 0);
_reply.readException();
if ((0!=_reply.readInt())) {
_result = cyanogenmod.hardware.DisplayMode.CREATOR.createFromParcel(_reply);
}
else {
_result = null;
}
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public cyanogenmod.hardware.DisplayMode getDefaultDisplayMode() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
cyanogenmod.hardware.DisplayMode _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_getDefaultDisplayMode, _data, _reply, 0);
_reply.readException();
if ((0!=_reply.readInt())) {
_result = cyanogenmod.hardware.DisplayMode.CREATOR.createFromParcel(_reply);
}
else {
_result = null;
}
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public boolean setDisplayMode(cyanogenmod.hardware.DisplayMode mode, boolean makeDefault) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
boolean _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
if ((mode!=null)) {
_data.writeInt(1);
mode.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
_data.writeInt(((makeDefault)?(1):(0)));
mRemote.transact(Stub.TRANSACTION_setDisplayMode, _data, _reply, 0);
_reply.readException();
_result = (0!=_reply.readInt());
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public boolean writePersistentBytes(java.lang.String key, byte[] bytes) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
boolean _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeString(key);
_data.writeByteArray(bytes);
mRemote.transact(Stub.TRANSACTION_writePersistentBytes, _data, _reply, 0);
_reply.readException();
_result = (0!=_reply.readInt());
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public byte[] readPersistentBytes(java.lang.String key) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
byte[] _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeString(key);
mRemote.transact(Stub.TRANSACTION_readPersistentBytes, _data, _reply, 0);
_reply.readException();
_result = _reply.createByteArray();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public int getThermalState() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
int _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_getThermalState, _data, _reply, 0);
_reply.readException();
_result = _reply.readInt();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public boolean registerThermalListener(cyanogenmod.hardware.IThermalListenerCallback callback) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
boolean _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeStrongBinder((((callback!=null))?(callback.asBinder()):(null)));
mRemote.transact(Stub.TRANSACTION_registerThermalListener, _data, _reply, 0);
_reply.readException();
_result = (0!=_reply.readInt());
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public boolean unRegisterThermalListener(cyanogenmod.hardware.IThermalListenerCallback callback) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
boolean _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeStrongBinder((((callback!=null))?(callback.asBinder()):(null)));
mRemote.transact(Stub.TRANSACTION_unRegisterThermalListener, _data, _reply, 0);
_reply.readException();
_result = (0!=_reply.readInt());
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public boolean isSunlightEnhancementSelfManaged() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
boolean _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_isSunlightEnhancementSelfManaged, _data, _reply, 0);
_reply.readException();
_result = (0!=_reply.readInt());
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public java.lang.String getUniqueDeviceId() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
java.lang.String _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_getUniqueDeviceId, _data, _reply, 0);
_reply.readException();
_result = _reply.readString();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public int getColorBalanceMin() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
int _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_getColorBalanceMin, _data, _reply, 0);
_reply.readException();
_result = _reply.readInt();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public int getColorBalanceMax() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
int _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_getColorBalanceMax, _data, _reply, 0);
_reply.readException();
_result = _reply.readInt();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public int getColorBalance() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
int _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_getColorBalance, _data, _reply, 0);
_reply.readException();
_result = _reply.readInt();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public boolean setColorBalance(int value) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
boolean _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(value);
mRemote.transact(Stub.TRANSACTION_setColorBalance, _data, _reply, 0);
_reply.readException();
_result = (0!=_reply.readInt());
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public cyanogenmod.hardware.HSIC getPictureAdjustment() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
cyanogenmod.hardware.HSIC _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_getPictureAdjustment, _data, _reply, 0);
_reply.readException();
if ((0!=_reply.readInt())) {
_result = cyanogenmod.hardware.HSIC.CREATOR.createFromParcel(_reply);
}
else {
_result = null;
}
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public cyanogenmod.hardware.HSIC getDefaultPictureAdjustment() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
cyanogenmod.hardware.HSIC _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_getDefaultPictureAdjustment, _data, _reply, 0);
_reply.readException();
if ((0!=_reply.readInt())) {
_result = cyanogenmod.hardware.HSIC.CREATOR.createFromParcel(_reply);
}
else {
_result = null;
}
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public boolean setPictureAdjustment(cyanogenmod.hardware.HSIC hsic) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
boolean _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
if ((hsic!=null)) {
_data.writeInt(1);
hsic.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
mRemote.transact(Stub.TRANSACTION_setPictureAdjustment, _data, _reply, 0);
_reply.readException();
_result = (0!=_reply.readInt());
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public float[] getPictureAdjustmentRanges() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
float[] _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_getPictureAdjustmentRanges, _data, _reply, 0);
_reply.readException();
_result = _reply.createFloatArray();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
}
static final int TRANSACTION_getSupportedFeatures = (android.os.IBinder.FIRST_CALL_TRANSACTION + 0);
static final int TRANSACTION_get = (android.os.IBinder.FIRST_CALL_TRANSACTION + 1);
static final int TRANSACTION_set = (android.os.IBinder.FIRST_CALL_TRANSACTION + 2);
static final int TRANSACTION_getDisplayColorCalibration = (android.os.IBinder.FIRST_CALL_TRANSACTION + 3);
static final int TRANSACTION_setDisplayColorCalibration = (android.os.IBinder.FIRST_CALL_TRANSACTION + 4);
static final int TRANSACTION_getNumGammaControls = (android.os.IBinder.FIRST_CALL_TRANSACTION + 5);
static final int TRANSACTION_getDisplayGammaCalibration = (android.os.IBinder.FIRST_CALL_TRANSACTION + 6);
static final int TRANSACTION_setDisplayGammaCalibration = (android.os.IBinder.FIRST_CALL_TRANSACTION + 7);
static final int TRANSACTION_getVibratorIntensity = (android.os.IBinder.FIRST_CALL_TRANSACTION + 8);
static final int TRANSACTION_setVibratorIntensity = (android.os.IBinder.FIRST_CALL_TRANSACTION + 9);
static final int TRANSACTION_getLtoSource = (android.os.IBinder.FIRST_CALL_TRANSACTION + 10);
static final int TRANSACTION_getLtoDestination = (android.os.IBinder.FIRST_CALL_TRANSACTION + 11);
static final int TRANSACTION_getLtoDownloadInterval = (android.os.IBinder.FIRST_CALL_TRANSACTION + 12);
static final int TRANSACTION_getSerialNumber = (android.os.IBinder.FIRST_CALL_TRANSACTION + 13);
static final int TRANSACTION_requireAdaptiveBacklightForSunlightEnhancement = (android.os.IBinder.FIRST_CALL_TRANSACTION + 14);
static final int TRANSACTION_getDisplayModes = (android.os.IBinder.FIRST_CALL_TRANSACTION + 15);
static final int TRANSACTION_getCurrentDisplayMode = (android.os.IBinder.FIRST_CALL_TRANSACTION + 16);
static final int TRANSACTION_getDefaultDisplayMode = (android.os.IBinder.FIRST_CALL_TRANSACTION + 17);
static final int TRANSACTION_setDisplayMode = (android.os.IBinder.FIRST_CALL_TRANSACTION + 18);
static final int TRANSACTION_writePersistentBytes = (android.os.IBinder.FIRST_CALL_TRANSACTION + 19);
static final int TRANSACTION_readPersistentBytes = (android.os.IBinder.FIRST_CALL_TRANSACTION + 20);
static final int TRANSACTION_getThermalState = (android.os.IBinder.FIRST_CALL_TRANSACTION + 21);
static final int TRANSACTION_registerThermalListener = (android.os.IBinder.FIRST_CALL_TRANSACTION + 22);
static final int TRANSACTION_unRegisterThermalListener = (android.os.IBinder.FIRST_CALL_TRANSACTION + 23);
static final int TRANSACTION_isSunlightEnhancementSelfManaged = (android.os.IBinder.FIRST_CALL_TRANSACTION + 24);
static final int TRANSACTION_getUniqueDeviceId = (android.os.IBinder.FIRST_CALL_TRANSACTION + 25);
static final int TRANSACTION_getColorBalanceMin = (android.os.IBinder.FIRST_CALL_TRANSACTION + 26);
static final int TRANSACTION_getColorBalanceMax = (android.os.IBinder.FIRST_CALL_TRANSACTION + 27);
static final int TRANSACTION_getColorBalance = (android.os.IBinder.FIRST_CALL_TRANSACTION + 28);
static final int TRANSACTION_setColorBalance = (android.os.IBinder.FIRST_CALL_TRANSACTION + 29);
static final int TRANSACTION_getPictureAdjustment = (android.os.IBinder.FIRST_CALL_TRANSACTION + 30);
static final int TRANSACTION_getDefaultPictureAdjustment = (android.os.IBinder.FIRST_CALL_TRANSACTION + 31);
static final int TRANSACTION_setPictureAdjustment = (android.os.IBinder.FIRST_CALL_TRANSACTION + 32);
static final int TRANSACTION_getPictureAdjustmentRanges = (android.os.IBinder.FIRST_CALL_TRANSACTION + 33);
}
public int getSupportedFeatures() throws android.os.RemoteException;
public boolean get(int feature) throws android.os.RemoteException;
public boolean set(int feature, boolean enable) throws android.os.RemoteException;
public int[] getDisplayColorCalibration() throws android.os.RemoteException;
public boolean setDisplayColorCalibration(int[] rgb) throws android.os.RemoteException;
public int getNumGammaControls() throws android.os.RemoteException;
public int[] getDisplayGammaCalibration(int idx) throws android.os.RemoteException;
public boolean setDisplayGammaCalibration(int idx, int[] rgb) throws android.os.RemoteException;
public int[] getVibratorIntensity() throws android.os.RemoteException;
public boolean setVibratorIntensity(int intensity) throws android.os.RemoteException;
public java.lang.String getLtoSource() throws android.os.RemoteException;
public java.lang.String getLtoDestination() throws android.os.RemoteException;
public long getLtoDownloadInterval() throws android.os.RemoteException;
public java.lang.String getSerialNumber() throws android.os.RemoteException;
public boolean requireAdaptiveBacklightForSunlightEnhancement() throws android.os.RemoteException;
public cyanogenmod.hardware.DisplayMode[] getDisplayModes() throws android.os.RemoteException;
public cyanogenmod.hardware.DisplayMode getCurrentDisplayMode() throws android.os.RemoteException;
public cyanogenmod.hardware.DisplayMode getDefaultDisplayMode() throws android.os.RemoteException;
public boolean setDisplayMode(cyanogenmod.hardware.DisplayMode mode, boolean makeDefault) throws android.os.RemoteException;
public boolean writePersistentBytes(java.lang.String key, byte[] bytes) throws android.os.RemoteException;
public byte[] readPersistentBytes(java.lang.String key) throws android.os.RemoteException;
public int getThermalState() throws android.os.RemoteException;
public boolean registerThermalListener(cyanogenmod.hardware.IThermalListenerCallback callback) throws android.os.RemoteException;
public boolean unRegisterThermalListener(cyanogenmod.hardware.IThermalListenerCallback callback) throws android.os.RemoteException;
public boolean isSunlightEnhancementSelfManaged() throws android.os.RemoteException;
public java.lang.String getUniqueDeviceId() throws android.os.RemoteException;
public int getColorBalanceMin() throws android.os.RemoteException;
public int getColorBalanceMax() throws android.os.RemoteException;
public int getColorBalance() throws android.os.RemoteException;
public boolean setColorBalance(int value) throws android.os.RemoteException;
public cyanogenmod.hardware.HSIC getPictureAdjustment() throws android.os.RemoteException;
public cyanogenmod.hardware.HSIC getDefaultPictureAdjustment() throws android.os.RemoteException;
public boolean setPictureAdjustment(cyanogenmod.hardware.HSIC hsic) throws android.os.RemoteException;
public float[] getPictureAdjustmentRanges() throws android.os.RemoteException;
}
