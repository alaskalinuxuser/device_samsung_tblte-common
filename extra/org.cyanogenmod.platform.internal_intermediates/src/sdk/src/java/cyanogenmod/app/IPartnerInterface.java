/*
 * This file is auto-generated.  DO NOT MODIFY.
 * Original file: vendor/cmsdk/sdk/src/java/cyanogenmod/app/IPartnerInterface.aidl
 */
package cyanogenmod.app;
/** {@hide} */
public interface IPartnerInterface extends android.os.IInterface
{
/** No-Op implementation  */
/** @hide */
public static class NoOp implements cyanogenmod.app.IPartnerInterface
{
@Override public android.os.IBinder asBinder()
{
return null;
}
@Override public void setAirplaneModeEnabled(boolean enabled) throws android.os.RemoteException
{
}
@Override public void setMobileDataEnabled(boolean enabled) throws android.os.RemoteException
{
}
@Override public boolean setZenMode(int mode) throws android.os.RemoteException
{
return false;
}
@Override public void shutdown() throws android.os.RemoteException
{
}
@Override public void reboot() throws android.os.RemoteException
{
}
@Override public java.lang.String getCurrentHotwordPackageName() throws android.os.RemoteException
{
return null;
}
@Override public boolean setZenModeWithDuration(int mode, long durationMillis) throws android.os.RemoteException
{
return false;
}
}
/** Local-side IPC implementation stub class. */
public static abstract class Stub extends android.os.Binder implements cyanogenmod.app.IPartnerInterface
{
private static final java.lang.String DESCRIPTOR = "cyanogenmod.app.IPartnerInterface";
/** Construct the stub at attach it to the interface. */
public Stub()
{
this.attachInterface(this, DESCRIPTOR);
}
/**
 * Cast an IBinder object into an cyanogenmod.app.IPartnerInterface interface,
 * generating a proxy if needed.
 */
public static cyanogenmod.app.IPartnerInterface asInterface(android.os.IBinder obj)
{
if ((obj==null)) {
return null;
}
android.os.IInterface iin = obj.queryLocalInterface(DESCRIPTOR);
if (((iin!=null)&&(iin instanceof cyanogenmod.app.IPartnerInterface))) {
return ((cyanogenmod.app.IPartnerInterface)iin);
}
return new cyanogenmod.app.IPartnerInterface.Stub.Proxy(obj);
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
case TRANSACTION_setAirplaneModeEnabled_0:
{
data.enforceInterface(DESCRIPTOR);
boolean _arg0;
_arg0 = (0!=data.readInt());
this.setAirplaneModeEnabled(_arg0);
reply.writeNoException();
return true;
}
case TRANSACTION_setMobileDataEnabled_1:
{
data.enforceInterface(DESCRIPTOR);
boolean _arg0;
_arg0 = (0!=data.readInt());
this.setMobileDataEnabled(_arg0);
reply.writeNoException();
return true;
}
case TRANSACTION_setZenMode:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
boolean _result = this.setZenMode(_arg0);
reply.writeNoException();
reply.writeInt(((_result)?(1):(0)));
return true;
}
case TRANSACTION_shutdown:
{
data.enforceInterface(DESCRIPTOR);
this.shutdown();
reply.writeNoException();
return true;
}
case TRANSACTION_reboot:
{
data.enforceInterface(DESCRIPTOR);
this.reboot();
reply.writeNoException();
return true;
}
case TRANSACTION_getCurrentHotwordPackageName:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _result = this.getCurrentHotwordPackageName();
reply.writeNoException();
reply.writeString(_result);
return true;
}
case TRANSACTION_setZenModeWithDuration:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
long _arg1;
_arg1 = data.readLong();
boolean _result = this.setZenModeWithDuration(_arg0, _arg1);
reply.writeNoException();
reply.writeInt(((_result)?(1):(0)));
return true;
}
}
return super.onTransact(code, data, reply, flags);
}
private static class Proxy implements cyanogenmod.app.IPartnerInterface
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
@Override public void setAirplaneModeEnabled(boolean enabled) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(((enabled)?(1):(0)));
mRemote.transact(Stub.TRANSACTION_setAirplaneModeEnabled_0, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public void setMobileDataEnabled(boolean enabled) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(((enabled)?(1):(0)));
mRemote.transact(Stub.TRANSACTION_setMobileDataEnabled_1, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public boolean setZenMode(int mode) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
boolean _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(mode);
mRemote.transact(Stub.TRANSACTION_setZenMode, _data, _reply, 0);
_reply.readException();
_result = (0!=_reply.readInt());
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public void shutdown() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_shutdown, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public void reboot() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_reboot, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public java.lang.String getCurrentHotwordPackageName() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
java.lang.String _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_getCurrentHotwordPackageName, _data, _reply, 0);
_reply.readException();
_result = _reply.readString();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public boolean setZenModeWithDuration(int mode, long durationMillis) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
boolean _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(mode);
_data.writeLong(durationMillis);
mRemote.transact(Stub.TRANSACTION_setZenModeWithDuration, _data, _reply, 0);
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
static final int TRANSACTION_setAirplaneModeEnabled_0 = (android.os.IBinder.FIRST_CALL_TRANSACTION + 0);
static final int TRANSACTION_setMobileDataEnabled_1 = (android.os.IBinder.FIRST_CALL_TRANSACTION + 1);
static final int TRANSACTION_setZenMode = (android.os.IBinder.FIRST_CALL_TRANSACTION + 2);
static final int TRANSACTION_shutdown = (android.os.IBinder.FIRST_CALL_TRANSACTION + 3);
static final int TRANSACTION_reboot = (android.os.IBinder.FIRST_CALL_TRANSACTION + 4);
static final int TRANSACTION_getCurrentHotwordPackageName = (android.os.IBinder.FIRST_CALL_TRANSACTION + 5);
static final int TRANSACTION_setZenModeWithDuration = (android.os.IBinder.FIRST_CALL_TRANSACTION + 6);
}
public void setAirplaneModeEnabled(boolean enabled) throws android.os.RemoteException;
public void setMobileDataEnabled(boolean enabled) throws android.os.RemoteException;
public boolean setZenMode(int mode) throws android.os.RemoteException;
public void shutdown() throws android.os.RemoteException;
public void reboot() throws android.os.RemoteException;
public java.lang.String getCurrentHotwordPackageName() throws android.os.RemoteException;
public boolean setZenModeWithDuration(int mode, long durationMillis) throws android.os.RemoteException;
}
