/*
 * This file is auto-generated.  DO NOT MODIFY.
 * Original file: vendor/cmsdk/sdk/src/java/cyanogenmod/themes/IThemeProcessingListener.aidl
 */
package cyanogenmod.themes;
/** {@hide} */
public interface IThemeProcessingListener extends android.os.IInterface
{
/** No-Op implementation  */
/** @hide */
public static class NoOp implements cyanogenmod.themes.IThemeProcessingListener
{
@Override public android.os.IBinder asBinder()
{
return null;
}
@Override public void onFinishedProcessing(java.lang.String pkgName) throws android.os.RemoteException
{
}
}
/** Local-side IPC implementation stub class. */
public static abstract class Stub extends android.os.Binder implements cyanogenmod.themes.IThemeProcessingListener
{
private static final java.lang.String DESCRIPTOR = "cyanogenmod.themes.IThemeProcessingListener";
/** Construct the stub at attach it to the interface. */
public Stub()
{
this.attachInterface(this, DESCRIPTOR);
}
/**
 * Cast an IBinder object into an cyanogenmod.themes.IThemeProcessingListener interface,
 * generating a proxy if needed.
 */
public static cyanogenmod.themes.IThemeProcessingListener asInterface(android.os.IBinder obj)
{
if ((obj==null)) {
return null;
}
android.os.IInterface iin = obj.queryLocalInterface(DESCRIPTOR);
if (((iin!=null)&&(iin instanceof cyanogenmod.themes.IThemeProcessingListener))) {
return ((cyanogenmod.themes.IThemeProcessingListener)iin);
}
return new cyanogenmod.themes.IThemeProcessingListener.Stub.Proxy(obj);
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
case TRANSACTION_onFinishedProcessing_0:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _arg0;
_arg0 = data.readString();
this.onFinishedProcessing(_arg0);
return true;
}
}
return super.onTransact(code, data, reply, flags);
}
private static class Proxy implements cyanogenmod.themes.IThemeProcessingListener
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
@Override public void onFinishedProcessing(java.lang.String pkgName) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeString(pkgName);
mRemote.transact(Stub.TRANSACTION_onFinishedProcessing_0, _data, null, android.os.IBinder.FLAG_ONEWAY);
}
finally {
_data.recycle();
}
}
}
static final int TRANSACTION_onFinishedProcessing_0 = (android.os.IBinder.FIRST_CALL_TRANSACTION + 0);
}
public void onFinishedProcessing(java.lang.String pkgName) throws android.os.RemoteException;
}
