/*
 * This file is auto-generated.  DO NOT MODIFY.
 * Original file: vendor/cmsdk/sdk/src/java/cyanogenmod/weather/IWeatherServiceProviderChangeListener.aidl
 */
package cyanogenmod.weather;
/** @hide */
public interface IWeatherServiceProviderChangeListener extends android.os.IInterface
{
/** No-Op implementation  */
/** @hide */
public static class NoOp implements cyanogenmod.weather.IWeatherServiceProviderChangeListener
{
@Override public android.os.IBinder asBinder()
{
return null;
}
@Override public void onWeatherServiceProviderChanged(java.lang.String providerLabel) throws android.os.RemoteException
{
}
}
/** Local-side IPC implementation stub class. */
public static abstract class Stub extends android.os.Binder implements cyanogenmod.weather.IWeatherServiceProviderChangeListener
{
private static final java.lang.String DESCRIPTOR = "cyanogenmod.weather.IWeatherServiceProviderChangeListener";
/** Construct the stub at attach it to the interface. */
public Stub()
{
this.attachInterface(this, DESCRIPTOR);
}
/**
 * Cast an IBinder object into an cyanogenmod.weather.IWeatherServiceProviderChangeListener interface,
 * generating a proxy if needed.
 */
public static cyanogenmod.weather.IWeatherServiceProviderChangeListener asInterface(android.os.IBinder obj)
{
if ((obj==null)) {
return null;
}
android.os.IInterface iin = obj.queryLocalInterface(DESCRIPTOR);
if (((iin!=null)&&(iin instanceof cyanogenmod.weather.IWeatherServiceProviderChangeListener))) {
return ((cyanogenmod.weather.IWeatherServiceProviderChangeListener)iin);
}
return new cyanogenmod.weather.IWeatherServiceProviderChangeListener.Stub.Proxy(obj);
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
case TRANSACTION_onWeatherServiceProviderChanged_0:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _arg0;
_arg0 = data.readString();
this.onWeatherServiceProviderChanged(_arg0);
return true;
}
}
return super.onTransact(code, data, reply, flags);
}
private static class Proxy implements cyanogenmod.weather.IWeatherServiceProviderChangeListener
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
@Override public void onWeatherServiceProviderChanged(java.lang.String providerLabel) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeString(providerLabel);
mRemote.transact(Stub.TRANSACTION_onWeatherServiceProviderChanged_0, _data, null, android.os.IBinder.FLAG_ONEWAY);
}
finally {
_data.recycle();
}
}
}
static final int TRANSACTION_onWeatherServiceProviderChanged_0 = (android.os.IBinder.FIRST_CALL_TRANSACTION + 0);
}
public void onWeatherServiceProviderChanged(java.lang.String providerLabel) throws android.os.RemoteException;
}
