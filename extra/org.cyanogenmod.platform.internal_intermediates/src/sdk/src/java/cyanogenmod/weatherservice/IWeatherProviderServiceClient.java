/*
 * This file is auto-generated.  DO NOT MODIFY.
 * Original file: vendor/cmsdk/sdk/src/java/cyanogenmod/weatherservice/IWeatherProviderServiceClient.aidl
 */
package cyanogenmod.weatherservice;
/** @hide */
public interface IWeatherProviderServiceClient extends android.os.IInterface
{
/** No-Op implementation  */
/** @hide */
public static class NoOp implements cyanogenmod.weatherservice.IWeatherProviderServiceClient
{
@Override public android.os.IBinder asBinder()
{
return null;
}
@Override public void setServiceRequestState(cyanogenmod.weather.RequestInfo requestInfo, cyanogenmod.weatherservice.ServiceRequestResult result, int state) throws android.os.RemoteException
{
}
}
/** Local-side IPC implementation stub class. */
public static abstract class Stub extends android.os.Binder implements cyanogenmod.weatherservice.IWeatherProviderServiceClient
{
private static final java.lang.String DESCRIPTOR = "cyanogenmod.weatherservice.IWeatherProviderServiceClient";
/** Construct the stub at attach it to the interface. */
public Stub()
{
this.attachInterface(this, DESCRIPTOR);
}
/**
 * Cast an IBinder object into an cyanogenmod.weatherservice.IWeatherProviderServiceClient interface,
 * generating a proxy if needed.
 */
public static cyanogenmod.weatherservice.IWeatherProviderServiceClient asInterface(android.os.IBinder obj)
{
if ((obj==null)) {
return null;
}
android.os.IInterface iin = obj.queryLocalInterface(DESCRIPTOR);
if (((iin!=null)&&(iin instanceof cyanogenmod.weatherservice.IWeatherProviderServiceClient))) {
return ((cyanogenmod.weatherservice.IWeatherProviderServiceClient)iin);
}
return new cyanogenmod.weatherservice.IWeatherProviderServiceClient.Stub.Proxy(obj);
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
case TRANSACTION_setServiceRequestState:
{
data.enforceInterface(DESCRIPTOR);
cyanogenmod.weather.RequestInfo _arg0;
if ((0!=data.readInt())) {
_arg0 = cyanogenmod.weather.RequestInfo.CREATOR.createFromParcel(data);
}
else {
_arg0 = null;
}
cyanogenmod.weatherservice.ServiceRequestResult _arg1;
if ((0!=data.readInt())) {
_arg1 = cyanogenmod.weatherservice.ServiceRequestResult.CREATOR.createFromParcel(data);
}
else {
_arg1 = null;
}
int _arg2;
_arg2 = data.readInt();
this.setServiceRequestState(_arg0, _arg1, _arg2);
return true;
}
}
return super.onTransact(code, data, reply, flags);
}
private static class Proxy implements cyanogenmod.weatherservice.IWeatherProviderServiceClient
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
@Override public void setServiceRequestState(cyanogenmod.weather.RequestInfo requestInfo, cyanogenmod.weatherservice.ServiceRequestResult result, int state) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
if ((requestInfo!=null)) {
_data.writeInt(1);
requestInfo.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
if ((result!=null)) {
_data.writeInt(1);
result.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
_data.writeInt(state);
mRemote.transact(Stub.TRANSACTION_setServiceRequestState, _data, null, android.os.IBinder.FLAG_ONEWAY);
}
finally {
_data.recycle();
}
}
}
static final int TRANSACTION_setServiceRequestState = (android.os.IBinder.FIRST_CALL_TRANSACTION + 0);
}
public void setServiceRequestState(cyanogenmod.weather.RequestInfo requestInfo, cyanogenmod.weatherservice.ServiceRequestResult result, int state) throws android.os.RemoteException;
}
