/*
 * This file is auto-generated.  DO NOT MODIFY.
 * Original file: vendor/cmsdk/sdk/src/java/cyanogenmod/externalviews/IExternalViewProviderFactory.aidl
 */
package cyanogenmod.externalviews;
/** @hide */
public interface IExternalViewProviderFactory extends android.os.IInterface
{
/** No-Op implementation  */
/** @hide */
public static class NoOp implements cyanogenmod.externalviews.IExternalViewProviderFactory
{
@Override public android.os.IBinder asBinder()
{
return null;
}
@Override public android.os.IBinder createExternalView(android.os.Bundle options) throws android.os.RemoteException
{
return null;
}
}
/** Local-side IPC implementation stub class. */
public static abstract class Stub extends android.os.Binder implements cyanogenmod.externalviews.IExternalViewProviderFactory
{
private static final java.lang.String DESCRIPTOR = "cyanogenmod.externalviews.IExternalViewProviderFactory";
/** Construct the stub at attach it to the interface. */
public Stub()
{
this.attachInterface(this, DESCRIPTOR);
}
/**
 * Cast an IBinder object into an cyanogenmod.externalviews.IExternalViewProviderFactory interface,
 * generating a proxy if needed.
 */
public static cyanogenmod.externalviews.IExternalViewProviderFactory asInterface(android.os.IBinder obj)
{
if ((obj==null)) {
return null;
}
android.os.IInterface iin = obj.queryLocalInterface(DESCRIPTOR);
if (((iin!=null)&&(iin instanceof cyanogenmod.externalviews.IExternalViewProviderFactory))) {
return ((cyanogenmod.externalviews.IExternalViewProviderFactory)iin);
}
return new cyanogenmod.externalviews.IExternalViewProviderFactory.Stub.Proxy(obj);
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
case TRANSACTION_createExternalView_0:
{
data.enforceInterface(DESCRIPTOR);
android.os.Bundle _arg0;
if ((0!=data.readInt())) {
_arg0 = android.os.Bundle.CREATOR.createFromParcel(data);
}
else {
_arg0 = null;
}
android.os.IBinder _result = this.createExternalView(_arg0);
reply.writeNoException();
reply.writeStrongBinder(_result);
return true;
}
}
return super.onTransact(code, data, reply, flags);
}
private static class Proxy implements cyanogenmod.externalviews.IExternalViewProviderFactory
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
@Override public android.os.IBinder createExternalView(android.os.Bundle options) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
android.os.IBinder _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
if ((options!=null)) {
_data.writeInt(1);
options.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
mRemote.transact(Stub.TRANSACTION_createExternalView_0, _data, _reply, 0);
_reply.readException();
_result = _reply.readStrongBinder();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
}
static final int TRANSACTION_createExternalView_0 = (android.os.IBinder.FIRST_CALL_TRANSACTION + 0);
}
public android.os.IBinder createExternalView(android.os.Bundle options) throws android.os.RemoteException;
}
