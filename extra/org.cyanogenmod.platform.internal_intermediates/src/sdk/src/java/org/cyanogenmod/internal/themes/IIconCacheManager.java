/*
 * This file is auto-generated.  DO NOT MODIFY.
 * Original file: vendor/cmsdk/sdk/src/java/org/cyanogenmod/internal/themes/IIconCacheManager.aidl
 */
package org.cyanogenmod.internal.themes;
/** @hide */
public interface IIconCacheManager extends android.os.IInterface
{
/** No-Op implementation  */
/** @hide */
public static class NoOp implements org.cyanogenmod.internal.themes.IIconCacheManager
{
@Override public android.os.IBinder asBinder()
{
return null;
}
@Override public boolean cacheComposedIcon(android.graphics.Bitmap icon, java.lang.String path) throws android.os.RemoteException
{
return false;
}
}
/** Local-side IPC implementation stub class. */
public static abstract class Stub extends android.os.Binder implements org.cyanogenmod.internal.themes.IIconCacheManager
{
private static final java.lang.String DESCRIPTOR = "org.cyanogenmod.internal.themes.IIconCacheManager";
/** Construct the stub at attach it to the interface. */
public Stub()
{
this.attachInterface(this, DESCRIPTOR);
}
/**
 * Cast an IBinder object into an org.cyanogenmod.internal.themes.IIconCacheManager interface,
 * generating a proxy if needed.
 */
public static org.cyanogenmod.internal.themes.IIconCacheManager asInterface(android.os.IBinder obj)
{
if ((obj==null)) {
return null;
}
android.os.IInterface iin = obj.queryLocalInterface(DESCRIPTOR);
if (((iin!=null)&&(iin instanceof org.cyanogenmod.internal.themes.IIconCacheManager))) {
return ((org.cyanogenmod.internal.themes.IIconCacheManager)iin);
}
return new org.cyanogenmod.internal.themes.IIconCacheManager.Stub.Proxy(obj);
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
case TRANSACTION_cacheComposedIcon:
{
data.enforceInterface(DESCRIPTOR);
android.graphics.Bitmap _arg0;
if ((0!=data.readInt())) {
_arg0 = android.graphics.Bitmap.CREATOR.createFromParcel(data);
}
else {
_arg0 = null;
}
java.lang.String _arg1;
_arg1 = data.readString();
boolean _result = this.cacheComposedIcon(_arg0, _arg1);
reply.writeNoException();
reply.writeInt(((_result)?(1):(0)));
return true;
}
}
return super.onTransact(code, data, reply, flags);
}
private static class Proxy implements org.cyanogenmod.internal.themes.IIconCacheManager
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
@Override public boolean cacheComposedIcon(android.graphics.Bitmap icon, java.lang.String path) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
boolean _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
if ((icon!=null)) {
_data.writeInt(1);
icon.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
_data.writeString(path);
mRemote.transact(Stub.TRANSACTION_cacheComposedIcon, _data, _reply, 0);
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
static final int TRANSACTION_cacheComposedIcon = (android.os.IBinder.FIRST_CALL_TRANSACTION + 0);
}
public boolean cacheComposedIcon(android.graphics.Bitmap icon, java.lang.String path) throws android.os.RemoteException;
}
