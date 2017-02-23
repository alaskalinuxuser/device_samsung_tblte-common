/*
 * This file is auto-generated.  DO NOT MODIFY.
 * Original file: vendor/cmsdk/sdk/src/java/cyanogenmod/app/ICMTelephonyManager.aidl
 */
package cyanogenmod.app;
/** @hide */
public interface ICMTelephonyManager extends android.os.IInterface
{
/** No-Op implementation  */
/** @hide */
public static class NoOp implements cyanogenmod.app.ICMTelephonyManager
{
@Override public android.os.IBinder asBinder()
{
return null;
}
// --- Methods below are for use by 3rd party applications to manage phone and data connection
// You need the READ_MSIM_PHONE_STATE permission

@Override public java.util.List<android.telephony.SubscriptionInfo> getSubInformation() throws android.os.RemoteException
{
return null;
}
@Override public boolean isSubActive(int subId) throws android.os.RemoteException
{
return false;
}
@Override public boolean isDataConnectionSelectedOnSub(int subId) throws android.os.RemoteException
{
return false;
}
@Override public boolean isDataConnectionEnabled() throws android.os.RemoteException
{
return false;
}
// You need the MODIFY_MSIM_PHONE_STATE permission

@Override public void setSubState(int subId, boolean state) throws android.os.RemoteException
{
}
@Override public void setDataConnectionSelectedOnSub(int subId) throws android.os.RemoteException
{
}
@Override public void setDataConnectionState(boolean state) throws android.os.RemoteException
{
}
@Override public void setDefaultPhoneSub(int subId) throws android.os.RemoteException
{
}
@Override public void setDefaultSmsSub(int subId) throws android.os.RemoteException
{
}
}
/** Local-side IPC implementation stub class. */
public static abstract class Stub extends android.os.Binder implements cyanogenmod.app.ICMTelephonyManager
{
private static final java.lang.String DESCRIPTOR = "cyanogenmod.app.ICMTelephonyManager";
/** Construct the stub at attach it to the interface. */
public Stub()
{
this.attachInterface(this, DESCRIPTOR);
}
/**
 * Cast an IBinder object into an cyanogenmod.app.ICMTelephonyManager interface,
 * generating a proxy if needed.
 */
public static cyanogenmod.app.ICMTelephonyManager asInterface(android.os.IBinder obj)
{
if ((obj==null)) {
return null;
}
android.os.IInterface iin = obj.queryLocalInterface(DESCRIPTOR);
if (((iin!=null)&&(iin instanceof cyanogenmod.app.ICMTelephonyManager))) {
return ((cyanogenmod.app.ICMTelephonyManager)iin);
}
return new cyanogenmod.app.ICMTelephonyManager.Stub.Proxy(obj);
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
case TRANSACTION_getSubInformation:
{
data.enforceInterface(DESCRIPTOR);
java.util.List<android.telephony.SubscriptionInfo> _result = this.getSubInformation();
reply.writeNoException();
reply.writeTypedList(_result);
return true;
}
case TRANSACTION_isSubActive:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
boolean _result = this.isSubActive(_arg0);
reply.writeNoException();
reply.writeInt(((_result)?(1):(0)));
return true;
}
case TRANSACTION_isDataConnectionSelectedOnSub:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
boolean _result = this.isDataConnectionSelectedOnSub(_arg0);
reply.writeNoException();
reply.writeInt(((_result)?(1):(0)));
return true;
}
case TRANSACTION_isDataConnectionEnabled:
{
data.enforceInterface(DESCRIPTOR);
boolean _result = this.isDataConnectionEnabled();
reply.writeNoException();
reply.writeInt(((_result)?(1):(0)));
return true;
}
case TRANSACTION_setSubState:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
boolean _arg1;
_arg1 = (0!=data.readInt());
this.setSubState(_arg0, _arg1);
reply.writeNoException();
return true;
}
case TRANSACTION_setDataConnectionSelectedOnSub:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
this.setDataConnectionSelectedOnSub(_arg0);
reply.writeNoException();
return true;
}
case TRANSACTION_setDataConnectionState:
{
data.enforceInterface(DESCRIPTOR);
boolean _arg0;
_arg0 = (0!=data.readInt());
this.setDataConnectionState(_arg0);
reply.writeNoException();
return true;
}
case TRANSACTION_setDefaultPhoneSub:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
this.setDefaultPhoneSub(_arg0);
reply.writeNoException();
return true;
}
case TRANSACTION_setDefaultSmsSub:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
this.setDefaultSmsSub(_arg0);
reply.writeNoException();
return true;
}
}
return super.onTransact(code, data, reply, flags);
}
private static class Proxy implements cyanogenmod.app.ICMTelephonyManager
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
// --- Methods below are for use by 3rd party applications to manage phone and data connection
// You need the READ_MSIM_PHONE_STATE permission

@Override public java.util.List<android.telephony.SubscriptionInfo> getSubInformation() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
java.util.List<android.telephony.SubscriptionInfo> _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_getSubInformation, _data, _reply, 0);
_reply.readException();
_result = _reply.createTypedArrayList(android.telephony.SubscriptionInfo.CREATOR);
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public boolean isSubActive(int subId) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
boolean _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(subId);
mRemote.transact(Stub.TRANSACTION_isSubActive, _data, _reply, 0);
_reply.readException();
_result = (0!=_reply.readInt());
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public boolean isDataConnectionSelectedOnSub(int subId) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
boolean _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(subId);
mRemote.transact(Stub.TRANSACTION_isDataConnectionSelectedOnSub, _data, _reply, 0);
_reply.readException();
_result = (0!=_reply.readInt());
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public boolean isDataConnectionEnabled() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
boolean _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_isDataConnectionEnabled, _data, _reply, 0);
_reply.readException();
_result = (0!=_reply.readInt());
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
// You need the MODIFY_MSIM_PHONE_STATE permission

@Override public void setSubState(int subId, boolean state) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(subId);
_data.writeInt(((state)?(1):(0)));
mRemote.transact(Stub.TRANSACTION_setSubState, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public void setDataConnectionSelectedOnSub(int subId) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(subId);
mRemote.transact(Stub.TRANSACTION_setDataConnectionSelectedOnSub, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public void setDataConnectionState(boolean state) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(((state)?(1):(0)));
mRemote.transact(Stub.TRANSACTION_setDataConnectionState, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public void setDefaultPhoneSub(int subId) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(subId);
mRemote.transact(Stub.TRANSACTION_setDefaultPhoneSub, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public void setDefaultSmsSub(int subId) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(subId);
mRemote.transact(Stub.TRANSACTION_setDefaultSmsSub, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
}
static final int TRANSACTION_getSubInformation = (android.os.IBinder.FIRST_CALL_TRANSACTION + 0);
static final int TRANSACTION_isSubActive = (android.os.IBinder.FIRST_CALL_TRANSACTION + 1);
static final int TRANSACTION_isDataConnectionSelectedOnSub = (android.os.IBinder.FIRST_CALL_TRANSACTION + 2);
static final int TRANSACTION_isDataConnectionEnabled = (android.os.IBinder.FIRST_CALL_TRANSACTION + 3);
static final int TRANSACTION_setSubState = (android.os.IBinder.FIRST_CALL_TRANSACTION + 4);
static final int TRANSACTION_setDataConnectionSelectedOnSub = (android.os.IBinder.FIRST_CALL_TRANSACTION + 5);
static final int TRANSACTION_setDataConnectionState = (android.os.IBinder.FIRST_CALL_TRANSACTION + 6);
static final int TRANSACTION_setDefaultPhoneSub = (android.os.IBinder.FIRST_CALL_TRANSACTION + 7);
static final int TRANSACTION_setDefaultSmsSub = (android.os.IBinder.FIRST_CALL_TRANSACTION + 8);
}
// --- Methods below are for use by 3rd party applications to manage phone and data connection
// You need the READ_MSIM_PHONE_STATE permission

public java.util.List<android.telephony.SubscriptionInfo> getSubInformation() throws android.os.RemoteException;
public boolean isSubActive(int subId) throws android.os.RemoteException;
public boolean isDataConnectionSelectedOnSub(int subId) throws android.os.RemoteException;
public boolean isDataConnectionEnabled() throws android.os.RemoteException;
// You need the MODIFY_MSIM_PHONE_STATE permission

public void setSubState(int subId, boolean state) throws android.os.RemoteException;
public void setDataConnectionSelectedOnSub(int subId) throws android.os.RemoteException;
public void setDataConnectionState(boolean state) throws android.os.RemoteException;
public void setDefaultPhoneSub(int subId) throws android.os.RemoteException;
public void setDefaultSmsSub(int subId) throws android.os.RemoteException;
}
