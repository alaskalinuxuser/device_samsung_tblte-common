/*
 * This file is auto-generated.  DO NOT MODIFY.
 * Original file: vendor/cmsdk/sdk/src/java/cyanogenmod/app/ILiveLockScreenChangeListener.aidl
 */
package cyanogenmod.app;
/**
 * Listener interface for notifying clients that the current Live lock screen has changed.
 * @hide
 */
public interface ILiveLockScreenChangeListener extends android.os.IInterface
{
/** No-Op implementation  */
/** @hide */
public static class NoOp implements cyanogenmod.app.ILiveLockScreenChangeListener
{
@Override public android.os.IBinder asBinder()
{
return null;
}
@Override public void onLiveLockScreenChanged(cyanogenmod.app.LiveLockScreenInfo llsInfo) throws android.os.RemoteException
{
}
}
/** Local-side IPC implementation stub class. */
public static abstract class Stub extends android.os.Binder implements cyanogenmod.app.ILiveLockScreenChangeListener
{
private static final java.lang.String DESCRIPTOR = "cyanogenmod.app.ILiveLockScreenChangeListener";
/** Construct the stub at attach it to the interface. */
public Stub()
{
this.attachInterface(this, DESCRIPTOR);
}
/**
 * Cast an IBinder object into an cyanogenmod.app.ILiveLockScreenChangeListener interface,
 * generating a proxy if needed.
 */
public static cyanogenmod.app.ILiveLockScreenChangeListener asInterface(android.os.IBinder obj)
{
if ((obj==null)) {
return null;
}
android.os.IInterface iin = obj.queryLocalInterface(DESCRIPTOR);
if (((iin!=null)&&(iin instanceof cyanogenmod.app.ILiveLockScreenChangeListener))) {
return ((cyanogenmod.app.ILiveLockScreenChangeListener)iin);
}
return new cyanogenmod.app.ILiveLockScreenChangeListener.Stub.Proxy(obj);
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
case TRANSACTION_onLiveLockScreenChanged:
{
data.enforceInterface(DESCRIPTOR);
cyanogenmod.app.LiveLockScreenInfo _arg0;
if ((0!=data.readInt())) {
_arg0 = cyanogenmod.app.LiveLockScreenInfo.CREATOR.createFromParcel(data);
}
else {
_arg0 = null;
}
this.onLiveLockScreenChanged(_arg0);
reply.writeNoException();
return true;
}
}
return super.onTransact(code, data, reply, flags);
}
private static class Proxy implements cyanogenmod.app.ILiveLockScreenChangeListener
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
@Override public void onLiveLockScreenChanged(cyanogenmod.app.LiveLockScreenInfo llsInfo) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
if ((llsInfo!=null)) {
_data.writeInt(1);
llsInfo.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
mRemote.transact(Stub.TRANSACTION_onLiveLockScreenChanged, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
}
static final int TRANSACTION_onLiveLockScreenChanged = (android.os.IBinder.FIRST_CALL_TRANSACTION + 0);
}
public void onLiveLockScreenChanged(cyanogenmod.app.LiveLockScreenInfo llsInfo) throws android.os.RemoteException;
}
