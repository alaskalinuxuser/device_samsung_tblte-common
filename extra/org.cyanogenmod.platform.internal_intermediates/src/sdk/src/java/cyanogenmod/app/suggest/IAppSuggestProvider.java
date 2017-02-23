/*
 * This file is auto-generated.  DO NOT MODIFY.
 * Original file: vendor/cmsdk/sdk/src/java/cyanogenmod/app/suggest/IAppSuggestProvider.aidl
 */
package cyanogenmod.app.suggest;
/**
 * @hide
 */
public interface IAppSuggestProvider extends android.os.IInterface
{
/** No-Op implementation  */
/** @hide */
public static class NoOp implements cyanogenmod.app.suggest.IAppSuggestProvider
{
@Override public android.os.IBinder asBinder()
{
return null;
}
@Override public boolean handles(android.content.Intent intent) throws android.os.RemoteException
{
return false;
}
@Override public java.util.List<cyanogenmod.app.suggest.ApplicationSuggestion> getSuggestions(android.content.Intent intent) throws android.os.RemoteException
{
return null;
}
}
/** Local-side IPC implementation stub class. */
public static abstract class Stub extends android.os.Binder implements cyanogenmod.app.suggest.IAppSuggestProvider
{
private static final java.lang.String DESCRIPTOR = "cyanogenmod.app.suggest.IAppSuggestProvider";
/** Construct the stub at attach it to the interface. */
public Stub()
{
this.attachInterface(this, DESCRIPTOR);
}
/**
 * Cast an IBinder object into an cyanogenmod.app.suggest.IAppSuggestProvider interface,
 * generating a proxy if needed.
 */
public static cyanogenmod.app.suggest.IAppSuggestProvider asInterface(android.os.IBinder obj)
{
if ((obj==null)) {
return null;
}
android.os.IInterface iin = obj.queryLocalInterface(DESCRIPTOR);
if (((iin!=null)&&(iin instanceof cyanogenmod.app.suggest.IAppSuggestProvider))) {
return ((cyanogenmod.app.suggest.IAppSuggestProvider)iin);
}
return new cyanogenmod.app.suggest.IAppSuggestProvider.Stub.Proxy(obj);
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
case TRANSACTION_handles:
{
data.enforceInterface(DESCRIPTOR);
android.content.Intent _arg0;
if ((0!=data.readInt())) {
_arg0 = android.content.Intent.CREATOR.createFromParcel(data);
}
else {
_arg0 = null;
}
boolean _result = this.handles(_arg0);
reply.writeNoException();
reply.writeInt(((_result)?(1):(0)));
return true;
}
case TRANSACTION_getSuggestions:
{
data.enforceInterface(DESCRIPTOR);
android.content.Intent _arg0;
if ((0!=data.readInt())) {
_arg0 = android.content.Intent.CREATOR.createFromParcel(data);
}
else {
_arg0 = null;
}
java.util.List<cyanogenmod.app.suggest.ApplicationSuggestion> _result = this.getSuggestions(_arg0);
reply.writeNoException();
reply.writeTypedList(_result);
return true;
}
}
return super.onTransact(code, data, reply, flags);
}
private static class Proxy implements cyanogenmod.app.suggest.IAppSuggestProvider
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
@Override public boolean handles(android.content.Intent intent) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
boolean _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
if ((intent!=null)) {
_data.writeInt(1);
intent.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
mRemote.transact(Stub.TRANSACTION_handles, _data, _reply, 0);
_reply.readException();
_result = (0!=_reply.readInt());
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public java.util.List<cyanogenmod.app.suggest.ApplicationSuggestion> getSuggestions(android.content.Intent intent) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
java.util.List<cyanogenmod.app.suggest.ApplicationSuggestion> _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
if ((intent!=null)) {
_data.writeInt(1);
intent.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
mRemote.transact(Stub.TRANSACTION_getSuggestions, _data, _reply, 0);
_reply.readException();
_result = _reply.createTypedArrayList(cyanogenmod.app.suggest.ApplicationSuggestion.CREATOR);
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
}
static final int TRANSACTION_handles = (android.os.IBinder.FIRST_CALL_TRANSACTION + 0);
static final int TRANSACTION_getSuggestions = (android.os.IBinder.FIRST_CALL_TRANSACTION + 1);
}
public boolean handles(android.content.Intent intent) throws android.os.RemoteException;
public java.util.List<cyanogenmod.app.suggest.ApplicationSuggestion> getSuggestions(android.content.Intent intent) throws android.os.RemoteException;
}
