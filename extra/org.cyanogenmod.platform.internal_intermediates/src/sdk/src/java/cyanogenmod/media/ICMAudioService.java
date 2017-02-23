/*
 * This file is auto-generated.  DO NOT MODIFY.
 * Original file: vendor/cmsdk/sdk/src/java/cyanogenmod/media/ICMAudioService.aidl
 */
package cyanogenmod.media;
/** @hide */
public interface ICMAudioService extends android.os.IInterface
{
/** No-Op implementation  */
/** @hide */
public static class NoOp implements cyanogenmod.media.ICMAudioService
{
@Override public android.os.IBinder asBinder()
{
return null;
}
@Override public java.util.List<cyanogenmod.media.AudioSessionInfo> listAudioSessions(int streamType) throws android.os.RemoteException
{
return null;
}
}
/** Local-side IPC implementation stub class. */
public static abstract class Stub extends android.os.Binder implements cyanogenmod.media.ICMAudioService
{
private static final java.lang.String DESCRIPTOR = "cyanogenmod.media.ICMAudioService";
/** Construct the stub at attach it to the interface. */
public Stub()
{
this.attachInterface(this, DESCRIPTOR);
}
/**
 * Cast an IBinder object into an cyanogenmod.media.ICMAudioService interface,
 * generating a proxy if needed.
 */
public static cyanogenmod.media.ICMAudioService asInterface(android.os.IBinder obj)
{
if ((obj==null)) {
return null;
}
android.os.IInterface iin = obj.queryLocalInterface(DESCRIPTOR);
if (((iin!=null)&&(iin instanceof cyanogenmod.media.ICMAudioService))) {
return ((cyanogenmod.media.ICMAudioService)iin);
}
return new cyanogenmod.media.ICMAudioService.Stub.Proxy(obj);
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
case TRANSACTION_listAudioSessions_0:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
java.util.List<cyanogenmod.media.AudioSessionInfo> _result = this.listAudioSessions(_arg0);
reply.writeNoException();
reply.writeTypedList(_result);
return true;
}
}
return super.onTransact(code, data, reply, flags);
}
private static class Proxy implements cyanogenmod.media.ICMAudioService
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
@Override public java.util.List<cyanogenmod.media.AudioSessionInfo> listAudioSessions(int streamType) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
java.util.List<cyanogenmod.media.AudioSessionInfo> _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(streamType);
mRemote.transact(Stub.TRANSACTION_listAudioSessions_0, _data, _reply, 0);
_reply.readException();
_result = _reply.createTypedArrayList(cyanogenmod.media.AudioSessionInfo.CREATOR);
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
}
static final int TRANSACTION_listAudioSessions_0 = (android.os.IBinder.FIRST_CALL_TRANSACTION + 0);
}
public java.util.List<cyanogenmod.media.AudioSessionInfo> listAudioSessions(int streamType) throws android.os.RemoteException;
}
