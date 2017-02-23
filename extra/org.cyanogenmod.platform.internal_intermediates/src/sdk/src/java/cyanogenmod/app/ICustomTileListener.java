/*
 * This file is auto-generated.  DO NOT MODIFY.
 * Original file: vendor/cmsdk/sdk/src/java/cyanogenmod/app/ICustomTileListener.aidl
 */
package cyanogenmod.app;
/** @hide */
public interface ICustomTileListener extends android.os.IInterface
{
/** No-Op implementation  */
/** @hide */
public static class NoOp implements cyanogenmod.app.ICustomTileListener
{
@Override public android.os.IBinder asBinder()
{
return null;
}
@Override public void onListenerConnected() throws android.os.RemoteException
{
}
@Override public void onCustomTilePosted(cyanogenmod.app.IStatusBarCustomTileHolder customTileHolder) throws android.os.RemoteException
{
}
@Override public void onCustomTileRemoved(cyanogenmod.app.IStatusBarCustomTileHolder customTileHolder) throws android.os.RemoteException
{
}
}
/** Local-side IPC implementation stub class. */
public static abstract class Stub extends android.os.Binder implements cyanogenmod.app.ICustomTileListener
{
private static final java.lang.String DESCRIPTOR = "cyanogenmod.app.ICustomTileListener";
/** Construct the stub at attach it to the interface. */
public Stub()
{
this.attachInterface(this, DESCRIPTOR);
}
/**
 * Cast an IBinder object into an cyanogenmod.app.ICustomTileListener interface,
 * generating a proxy if needed.
 */
public static cyanogenmod.app.ICustomTileListener asInterface(android.os.IBinder obj)
{
if ((obj==null)) {
return null;
}
android.os.IInterface iin = obj.queryLocalInterface(DESCRIPTOR);
if (((iin!=null)&&(iin instanceof cyanogenmod.app.ICustomTileListener))) {
return ((cyanogenmod.app.ICustomTileListener)iin);
}
return new cyanogenmod.app.ICustomTileListener.Stub.Proxy(obj);
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
case TRANSACTION_onListenerConnected:
{
data.enforceInterface(DESCRIPTOR);
this.onListenerConnected();
return true;
}
case TRANSACTION_onCustomTilePosted:
{
data.enforceInterface(DESCRIPTOR);
cyanogenmod.app.IStatusBarCustomTileHolder _arg0;
_arg0 = cyanogenmod.app.IStatusBarCustomTileHolder.Stub.asInterface(data.readStrongBinder());
this.onCustomTilePosted(_arg0);
return true;
}
case TRANSACTION_onCustomTileRemoved:
{
data.enforceInterface(DESCRIPTOR);
cyanogenmod.app.IStatusBarCustomTileHolder _arg0;
_arg0 = cyanogenmod.app.IStatusBarCustomTileHolder.Stub.asInterface(data.readStrongBinder());
this.onCustomTileRemoved(_arg0);
return true;
}
}
return super.onTransact(code, data, reply, flags);
}
private static class Proxy implements cyanogenmod.app.ICustomTileListener
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
@Override public void onListenerConnected() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_onListenerConnected, _data, null, android.os.IBinder.FLAG_ONEWAY);
}
finally {
_data.recycle();
}
}
@Override public void onCustomTilePosted(cyanogenmod.app.IStatusBarCustomTileHolder customTileHolder) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeStrongBinder((((customTileHolder!=null))?(customTileHolder.asBinder()):(null)));
mRemote.transact(Stub.TRANSACTION_onCustomTilePosted, _data, null, android.os.IBinder.FLAG_ONEWAY);
}
finally {
_data.recycle();
}
}
@Override public void onCustomTileRemoved(cyanogenmod.app.IStatusBarCustomTileHolder customTileHolder) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeStrongBinder((((customTileHolder!=null))?(customTileHolder.asBinder()):(null)));
mRemote.transact(Stub.TRANSACTION_onCustomTileRemoved, _data, null, android.os.IBinder.FLAG_ONEWAY);
}
finally {
_data.recycle();
}
}
}
static final int TRANSACTION_onListenerConnected = (android.os.IBinder.FIRST_CALL_TRANSACTION + 0);
static final int TRANSACTION_onCustomTilePosted = (android.os.IBinder.FIRST_CALL_TRANSACTION + 1);
static final int TRANSACTION_onCustomTileRemoved = (android.os.IBinder.FIRST_CALL_TRANSACTION + 2);
}
public void onListenerConnected() throws android.os.RemoteException;
public void onCustomTilePosted(cyanogenmod.app.IStatusBarCustomTileHolder customTileHolder) throws android.os.RemoteException;
public void onCustomTileRemoved(cyanogenmod.app.IStatusBarCustomTileHolder customTileHolder) throws android.os.RemoteException;
}
