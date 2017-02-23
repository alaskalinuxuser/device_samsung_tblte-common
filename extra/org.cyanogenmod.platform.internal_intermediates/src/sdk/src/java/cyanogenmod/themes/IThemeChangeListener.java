/*
 * This file is auto-generated.  DO NOT MODIFY.
 * Original file: vendor/cmsdk/sdk/src/java/cyanogenmod/themes/IThemeChangeListener.aidl
 */
package cyanogenmod.themes;
/** {@hide} */
public interface IThemeChangeListener extends android.os.IInterface
{
/** No-Op implementation  */
/** @hide */
public static class NoOp implements cyanogenmod.themes.IThemeChangeListener
{
@Override public android.os.IBinder asBinder()
{
return null;
}
@Override public void onProgress(int progress) throws android.os.RemoteException
{
}
@Override public void onFinish(boolean isSuccess) throws android.os.RemoteException
{
}
}
/** Local-side IPC implementation stub class. */
public static abstract class Stub extends android.os.Binder implements cyanogenmod.themes.IThemeChangeListener
{
private static final java.lang.String DESCRIPTOR = "cyanogenmod.themes.IThemeChangeListener";
/** Construct the stub at attach it to the interface. */
public Stub()
{
this.attachInterface(this, DESCRIPTOR);
}
/**
 * Cast an IBinder object into an cyanogenmod.themes.IThemeChangeListener interface,
 * generating a proxy if needed.
 */
public static cyanogenmod.themes.IThemeChangeListener asInterface(android.os.IBinder obj)
{
if ((obj==null)) {
return null;
}
android.os.IInterface iin = obj.queryLocalInterface(DESCRIPTOR);
if (((iin!=null)&&(iin instanceof cyanogenmod.themes.IThemeChangeListener))) {
return ((cyanogenmod.themes.IThemeChangeListener)iin);
}
return new cyanogenmod.themes.IThemeChangeListener.Stub.Proxy(obj);
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
case TRANSACTION_onProgress_0:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
this.onProgress(_arg0);
return true;
}
case TRANSACTION_onFinish_1:
{
data.enforceInterface(DESCRIPTOR);
boolean _arg0;
_arg0 = (0!=data.readInt());
this.onFinish(_arg0);
return true;
}
}
return super.onTransact(code, data, reply, flags);
}
private static class Proxy implements cyanogenmod.themes.IThemeChangeListener
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
@Override public void onProgress(int progress) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(progress);
mRemote.transact(Stub.TRANSACTION_onProgress_0, _data, null, android.os.IBinder.FLAG_ONEWAY);
}
finally {
_data.recycle();
}
}
@Override public void onFinish(boolean isSuccess) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(((isSuccess)?(1):(0)));
mRemote.transact(Stub.TRANSACTION_onFinish_1, _data, null, android.os.IBinder.FLAG_ONEWAY);
}
finally {
_data.recycle();
}
}
}
static final int TRANSACTION_onProgress_0 = (android.os.IBinder.FIRST_CALL_TRANSACTION + 0);
static final int TRANSACTION_onFinish_1 = (android.os.IBinder.FIRST_CALL_TRANSACTION + 1);
}
public void onProgress(int progress) throws android.os.RemoteException;
public void onFinish(boolean isSuccess) throws android.os.RemoteException;
}
