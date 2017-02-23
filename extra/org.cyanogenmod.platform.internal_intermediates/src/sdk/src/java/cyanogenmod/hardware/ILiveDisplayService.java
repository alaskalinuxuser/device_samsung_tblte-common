/*
 * This file is auto-generated.  DO NOT MODIFY.
 * Original file: vendor/cmsdk/sdk/src/java/cyanogenmod/hardware/ILiveDisplayService.aidl
 */
package cyanogenmod.hardware;
/** @hide */
public interface ILiveDisplayService extends android.os.IInterface
{
/** No-Op implementation  */
/** @hide */
public static class NoOp implements cyanogenmod.hardware.ILiveDisplayService
{
@Override public android.os.IBinder asBinder()
{
return null;
}
@Override public cyanogenmod.hardware.LiveDisplayConfig getConfig() throws android.os.RemoteException
{
return null;
}
@Override public int getMode() throws android.os.RemoteException
{
return 0;
}
@Override public boolean setMode(int mode) throws android.os.RemoteException
{
return false;
}
@Override public float[] getColorAdjustment() throws android.os.RemoteException
{
return null;
}
@Override public boolean setColorAdjustment(float[] adj) throws android.os.RemoteException
{
return false;
}
@Override public boolean isAutoContrastEnabled() throws android.os.RemoteException
{
return false;
}
@Override public boolean setAutoContrastEnabled(boolean enabled) throws android.os.RemoteException
{
return false;
}
@Override public boolean isCABCEnabled() throws android.os.RemoteException
{
return false;
}
@Override public boolean setCABCEnabled(boolean enabled) throws android.os.RemoteException
{
return false;
}
@Override public boolean isColorEnhancementEnabled() throws android.os.RemoteException
{
return false;
}
@Override public boolean setColorEnhancementEnabled(boolean enabled) throws android.os.RemoteException
{
return false;
}
@Override public int getDayColorTemperature() throws android.os.RemoteException
{
return 0;
}
@Override public boolean setDayColorTemperature(int temperature) throws android.os.RemoteException
{
return false;
}
@Override public int getNightColorTemperature() throws android.os.RemoteException
{
return 0;
}
@Override public boolean setNightColorTemperature(int temperature) throws android.os.RemoteException
{
return false;
}
@Override public int getColorTemperature() throws android.os.RemoteException
{
return 0;
}
@Override public boolean isAutomaticOutdoorModeEnabled() throws android.os.RemoteException
{
return false;
}
@Override public boolean setAutomaticOutdoorModeEnabled(boolean enabled) throws android.os.RemoteException
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
@Override public boolean setPictureAdjustment(cyanogenmod.hardware.HSIC adj) throws android.os.RemoteException
{
return false;
}
}
/** Local-side IPC implementation stub class. */
public static abstract class Stub extends android.os.Binder implements cyanogenmod.hardware.ILiveDisplayService
{
private static final java.lang.String DESCRIPTOR = "cyanogenmod.hardware.ILiveDisplayService";
/** Construct the stub at attach it to the interface. */
public Stub()
{
this.attachInterface(this, DESCRIPTOR);
}
/**
 * Cast an IBinder object into an cyanogenmod.hardware.ILiveDisplayService interface,
 * generating a proxy if needed.
 */
public static cyanogenmod.hardware.ILiveDisplayService asInterface(android.os.IBinder obj)
{
if ((obj==null)) {
return null;
}
android.os.IInterface iin = obj.queryLocalInterface(DESCRIPTOR);
if (((iin!=null)&&(iin instanceof cyanogenmod.hardware.ILiveDisplayService))) {
return ((cyanogenmod.hardware.ILiveDisplayService)iin);
}
return new cyanogenmod.hardware.ILiveDisplayService.Stub.Proxy(obj);
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
case TRANSACTION_getConfig:
{
data.enforceInterface(DESCRIPTOR);
cyanogenmod.hardware.LiveDisplayConfig _result = this.getConfig();
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
case TRANSACTION_getMode:
{
data.enforceInterface(DESCRIPTOR);
int _result = this.getMode();
reply.writeNoException();
reply.writeInt(_result);
return true;
}
case TRANSACTION_setMode:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
boolean _result = this.setMode(_arg0);
reply.writeNoException();
reply.writeInt(((_result)?(1):(0)));
return true;
}
case TRANSACTION_getColorAdjustment:
{
data.enforceInterface(DESCRIPTOR);
float[] _result = this.getColorAdjustment();
reply.writeNoException();
reply.writeFloatArray(_result);
return true;
}
case TRANSACTION_setColorAdjustment:
{
data.enforceInterface(DESCRIPTOR);
float[] _arg0;
_arg0 = data.createFloatArray();
boolean _result = this.setColorAdjustment(_arg0);
reply.writeNoException();
reply.writeInt(((_result)?(1):(0)));
return true;
}
case TRANSACTION_isAutoContrastEnabled:
{
data.enforceInterface(DESCRIPTOR);
boolean _result = this.isAutoContrastEnabled();
reply.writeNoException();
reply.writeInt(((_result)?(1):(0)));
return true;
}
case TRANSACTION_setAutoContrastEnabled_6:
{
data.enforceInterface(DESCRIPTOR);
boolean _arg0;
_arg0 = (0!=data.readInt());
boolean _result = this.setAutoContrastEnabled(_arg0);
reply.writeNoException();
reply.writeInt(((_result)?(1):(0)));
return true;
}
case TRANSACTION_isCABCEnabled:
{
data.enforceInterface(DESCRIPTOR);
boolean _result = this.isCABCEnabled();
reply.writeNoException();
reply.writeInt(((_result)?(1):(0)));
return true;
}
case TRANSACTION_setCABCEnabled:
{
data.enforceInterface(DESCRIPTOR);
boolean _arg0;
_arg0 = (0!=data.readInt());
boolean _result = this.setCABCEnabled(_arg0);
reply.writeNoException();
reply.writeInt(((_result)?(1):(0)));
return true;
}
case TRANSACTION_isColorEnhancementEnabled:
{
data.enforceInterface(DESCRIPTOR);
boolean _result = this.isColorEnhancementEnabled();
reply.writeNoException();
reply.writeInt(((_result)?(1):(0)));
return true;
}
case TRANSACTION_setColorEnhancementEnabled:
{
data.enforceInterface(DESCRIPTOR);
boolean _arg0;
_arg0 = (0!=data.readInt());
boolean _result = this.setColorEnhancementEnabled(_arg0);
reply.writeNoException();
reply.writeInt(((_result)?(1):(0)));
return true;
}
case TRANSACTION_getDayColorTemperature:
{
data.enforceInterface(DESCRIPTOR);
int _result = this.getDayColorTemperature();
reply.writeNoException();
reply.writeInt(_result);
return true;
}
case TRANSACTION_setDayColorTemperature:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
boolean _result = this.setDayColorTemperature(_arg0);
reply.writeNoException();
reply.writeInt(((_result)?(1):(0)));
return true;
}
case TRANSACTION_getNightColorTemperature:
{
data.enforceInterface(DESCRIPTOR);
int _result = this.getNightColorTemperature();
reply.writeNoException();
reply.writeInt(_result);
return true;
}
case TRANSACTION_setNightColorTemperature:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
boolean _result = this.setNightColorTemperature(_arg0);
reply.writeNoException();
reply.writeInt(((_result)?(1):(0)));
return true;
}
case TRANSACTION_getColorTemperature:
{
data.enforceInterface(DESCRIPTOR);
int _result = this.getColorTemperature();
reply.writeNoException();
reply.writeInt(_result);
return true;
}
case TRANSACTION_isAutomaticOutdoorModeEnabled:
{
data.enforceInterface(DESCRIPTOR);
boolean _result = this.isAutomaticOutdoorModeEnabled();
reply.writeNoException();
reply.writeInt(((_result)?(1):(0)));
return true;
}
case TRANSACTION_setAutomaticOutdoorModeEnabled:
{
data.enforceInterface(DESCRIPTOR);
boolean _arg0;
_arg0 = (0!=data.readInt());
boolean _result = this.setAutomaticOutdoorModeEnabled(_arg0);
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
}
return super.onTransact(code, data, reply, flags);
}
private static class Proxy implements cyanogenmod.hardware.ILiveDisplayService
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
@Override public cyanogenmod.hardware.LiveDisplayConfig getConfig() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
cyanogenmod.hardware.LiveDisplayConfig _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_getConfig, _data, _reply, 0);
_reply.readException();
if ((0!=_reply.readInt())) {
_result = cyanogenmod.hardware.LiveDisplayConfig.CREATOR.createFromParcel(_reply);
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
@Override public int getMode() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
int _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_getMode, _data, _reply, 0);
_reply.readException();
_result = _reply.readInt();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public boolean setMode(int mode) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
boolean _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(mode);
mRemote.transact(Stub.TRANSACTION_setMode, _data, _reply, 0);
_reply.readException();
_result = (0!=_reply.readInt());
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public float[] getColorAdjustment() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
float[] _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_getColorAdjustment, _data, _reply, 0);
_reply.readException();
_result = _reply.createFloatArray();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public boolean setColorAdjustment(float[] adj) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
boolean _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeFloatArray(adj);
mRemote.transact(Stub.TRANSACTION_setColorAdjustment, _data, _reply, 0);
_reply.readException();
_result = (0!=_reply.readInt());
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public boolean isAutoContrastEnabled() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
boolean _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_isAutoContrastEnabled, _data, _reply, 0);
_reply.readException();
_result = (0!=_reply.readInt());
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public boolean setAutoContrastEnabled(boolean enabled) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
boolean _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(((enabled)?(1):(0)));
mRemote.transact(Stub.TRANSACTION_setAutoContrastEnabled_6, _data, _reply, 0);
_reply.readException();
_result = (0!=_reply.readInt());
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public boolean isCABCEnabled() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
boolean _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_isCABCEnabled, _data, _reply, 0);
_reply.readException();
_result = (0!=_reply.readInt());
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public boolean setCABCEnabled(boolean enabled) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
boolean _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(((enabled)?(1):(0)));
mRemote.transact(Stub.TRANSACTION_setCABCEnabled, _data, _reply, 0);
_reply.readException();
_result = (0!=_reply.readInt());
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public boolean isColorEnhancementEnabled() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
boolean _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_isColorEnhancementEnabled, _data, _reply, 0);
_reply.readException();
_result = (0!=_reply.readInt());
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public boolean setColorEnhancementEnabled(boolean enabled) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
boolean _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(((enabled)?(1):(0)));
mRemote.transact(Stub.TRANSACTION_setColorEnhancementEnabled, _data, _reply, 0);
_reply.readException();
_result = (0!=_reply.readInt());
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public int getDayColorTemperature() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
int _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_getDayColorTemperature, _data, _reply, 0);
_reply.readException();
_result = _reply.readInt();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public boolean setDayColorTemperature(int temperature) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
boolean _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(temperature);
mRemote.transact(Stub.TRANSACTION_setDayColorTemperature, _data, _reply, 0);
_reply.readException();
_result = (0!=_reply.readInt());
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public int getNightColorTemperature() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
int _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_getNightColorTemperature, _data, _reply, 0);
_reply.readException();
_result = _reply.readInt();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public boolean setNightColorTemperature(int temperature) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
boolean _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(temperature);
mRemote.transact(Stub.TRANSACTION_setNightColorTemperature, _data, _reply, 0);
_reply.readException();
_result = (0!=_reply.readInt());
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public int getColorTemperature() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
int _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_getColorTemperature, _data, _reply, 0);
_reply.readException();
_result = _reply.readInt();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public boolean isAutomaticOutdoorModeEnabled() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
boolean _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_isAutomaticOutdoorModeEnabled, _data, _reply, 0);
_reply.readException();
_result = (0!=_reply.readInt());
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public boolean setAutomaticOutdoorModeEnabled(boolean enabled) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
boolean _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(((enabled)?(1):(0)));
mRemote.transact(Stub.TRANSACTION_setAutomaticOutdoorModeEnabled, _data, _reply, 0);
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
@Override public boolean setPictureAdjustment(cyanogenmod.hardware.HSIC adj) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
boolean _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
if ((adj!=null)) {
_data.writeInt(1);
adj.writeToParcel(_data, 0);
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
}
static final int TRANSACTION_getConfig = (android.os.IBinder.FIRST_CALL_TRANSACTION + 0);
static final int TRANSACTION_getMode = (android.os.IBinder.FIRST_CALL_TRANSACTION + 1);
static final int TRANSACTION_setMode = (android.os.IBinder.FIRST_CALL_TRANSACTION + 2);
static final int TRANSACTION_getColorAdjustment = (android.os.IBinder.FIRST_CALL_TRANSACTION + 3);
static final int TRANSACTION_setColorAdjustment = (android.os.IBinder.FIRST_CALL_TRANSACTION + 4);
static final int TRANSACTION_isAutoContrastEnabled = (android.os.IBinder.FIRST_CALL_TRANSACTION + 5);
static final int TRANSACTION_setAutoContrastEnabled_6 = (android.os.IBinder.FIRST_CALL_TRANSACTION + 6);
static final int TRANSACTION_isCABCEnabled = (android.os.IBinder.FIRST_CALL_TRANSACTION + 7);
static final int TRANSACTION_setCABCEnabled = (android.os.IBinder.FIRST_CALL_TRANSACTION + 8);
static final int TRANSACTION_isColorEnhancementEnabled = (android.os.IBinder.FIRST_CALL_TRANSACTION + 9);
static final int TRANSACTION_setColorEnhancementEnabled = (android.os.IBinder.FIRST_CALL_TRANSACTION + 10);
static final int TRANSACTION_getDayColorTemperature = (android.os.IBinder.FIRST_CALL_TRANSACTION + 11);
static final int TRANSACTION_setDayColorTemperature = (android.os.IBinder.FIRST_CALL_TRANSACTION + 12);
static final int TRANSACTION_getNightColorTemperature = (android.os.IBinder.FIRST_CALL_TRANSACTION + 13);
static final int TRANSACTION_setNightColorTemperature = (android.os.IBinder.FIRST_CALL_TRANSACTION + 14);
static final int TRANSACTION_getColorTemperature = (android.os.IBinder.FIRST_CALL_TRANSACTION + 15);
static final int TRANSACTION_isAutomaticOutdoorModeEnabled = (android.os.IBinder.FIRST_CALL_TRANSACTION + 16);
static final int TRANSACTION_setAutomaticOutdoorModeEnabled = (android.os.IBinder.FIRST_CALL_TRANSACTION + 17);
static final int TRANSACTION_getPictureAdjustment = (android.os.IBinder.FIRST_CALL_TRANSACTION + 18);
static final int TRANSACTION_getDefaultPictureAdjustment = (android.os.IBinder.FIRST_CALL_TRANSACTION + 19);
static final int TRANSACTION_setPictureAdjustment = (android.os.IBinder.FIRST_CALL_TRANSACTION + 20);
}
public cyanogenmod.hardware.LiveDisplayConfig getConfig() throws android.os.RemoteException;
public int getMode() throws android.os.RemoteException;
public boolean setMode(int mode) throws android.os.RemoteException;
public float[] getColorAdjustment() throws android.os.RemoteException;
public boolean setColorAdjustment(float[] adj) throws android.os.RemoteException;
public boolean isAutoContrastEnabled() throws android.os.RemoteException;
public boolean setAutoContrastEnabled(boolean enabled) throws android.os.RemoteException;
public boolean isCABCEnabled() throws android.os.RemoteException;
public boolean setCABCEnabled(boolean enabled) throws android.os.RemoteException;
public boolean isColorEnhancementEnabled() throws android.os.RemoteException;
public boolean setColorEnhancementEnabled(boolean enabled) throws android.os.RemoteException;
public int getDayColorTemperature() throws android.os.RemoteException;
public boolean setDayColorTemperature(int temperature) throws android.os.RemoteException;
public int getNightColorTemperature() throws android.os.RemoteException;
public boolean setNightColorTemperature(int temperature) throws android.os.RemoteException;
public int getColorTemperature() throws android.os.RemoteException;
public boolean isAutomaticOutdoorModeEnabled() throws android.os.RemoteException;
public boolean setAutomaticOutdoorModeEnabled(boolean enabled) throws android.os.RemoteException;
public cyanogenmod.hardware.HSIC getPictureAdjustment() throws android.os.RemoteException;
public cyanogenmod.hardware.HSIC getDefaultPictureAdjustment() throws android.os.RemoteException;
public boolean setPictureAdjustment(cyanogenmod.hardware.HSIC adj) throws android.os.RemoteException;
}
