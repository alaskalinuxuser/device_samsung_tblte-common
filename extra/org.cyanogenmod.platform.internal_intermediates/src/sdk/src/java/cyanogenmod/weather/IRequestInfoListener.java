/*
 * This file is auto-generated.  DO NOT MODIFY.
 * Original file: vendor/cmsdk/sdk/src/java/cyanogenmod/weather/IRequestInfoListener.aidl
 */
package cyanogenmod.weather;
/** @hide */
public interface IRequestInfoListener extends android.os.IInterface
{
/** No-Op implementation  */
/** @hide */
public static class NoOp implements cyanogenmod.weather.IRequestInfoListener
{
@Override public android.os.IBinder asBinder()
{
return null;
}
@Override public void onWeatherRequestCompleted(cyanogenmod.weather.RequestInfo requestInfo, int status, cyanogenmod.weather.WeatherInfo weatherInfo) throws android.os.RemoteException
{
}
@Override public void onLookupCityRequestCompleted(cyanogenmod.weather.RequestInfo requestInfo, int status, java.util.List<cyanogenmod.weather.WeatherLocation> weatherLocation) throws android.os.RemoteException
{
}
}
/** Local-side IPC implementation stub class. */
public static abstract class Stub extends android.os.Binder implements cyanogenmod.weather.IRequestInfoListener
{
private static final java.lang.String DESCRIPTOR = "cyanogenmod.weather.IRequestInfoListener";
/** Construct the stub at attach it to the interface. */
public Stub()
{
this.attachInterface(this, DESCRIPTOR);
}
/**
 * Cast an IBinder object into an cyanogenmod.weather.IRequestInfoListener interface,
 * generating a proxy if needed.
 */
public static cyanogenmod.weather.IRequestInfoListener asInterface(android.os.IBinder obj)
{
if ((obj==null)) {
return null;
}
android.os.IInterface iin = obj.queryLocalInterface(DESCRIPTOR);
if (((iin!=null)&&(iin instanceof cyanogenmod.weather.IRequestInfoListener))) {
return ((cyanogenmod.weather.IRequestInfoListener)iin);
}
return new cyanogenmod.weather.IRequestInfoListener.Stub.Proxy(obj);
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
case TRANSACTION_onWeatherRequestCompleted:
{
data.enforceInterface(DESCRIPTOR);
cyanogenmod.weather.RequestInfo _arg0;
if ((0!=data.readInt())) {
_arg0 = cyanogenmod.weather.RequestInfo.CREATOR.createFromParcel(data);
}
else {
_arg0 = null;
}
int _arg1;
_arg1 = data.readInt();
cyanogenmod.weather.WeatherInfo _arg2;
if ((0!=data.readInt())) {
_arg2 = cyanogenmod.weather.WeatherInfo.CREATOR.createFromParcel(data);
}
else {
_arg2 = null;
}
this.onWeatherRequestCompleted(_arg0, _arg1, _arg2);
return true;
}
case TRANSACTION_onLookupCityRequestCompleted:
{
data.enforceInterface(DESCRIPTOR);
cyanogenmod.weather.RequestInfo _arg0;
if ((0!=data.readInt())) {
_arg0 = cyanogenmod.weather.RequestInfo.CREATOR.createFromParcel(data);
}
else {
_arg0 = null;
}
int _arg1;
_arg1 = data.readInt();
java.util.List<cyanogenmod.weather.WeatherLocation> _arg2;
_arg2 = data.createTypedArrayList(cyanogenmod.weather.WeatherLocation.CREATOR);
this.onLookupCityRequestCompleted(_arg0, _arg1, _arg2);
return true;
}
}
return super.onTransact(code, data, reply, flags);
}
private static class Proxy implements cyanogenmod.weather.IRequestInfoListener
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
@Override public void onWeatherRequestCompleted(cyanogenmod.weather.RequestInfo requestInfo, int status, cyanogenmod.weather.WeatherInfo weatherInfo) throws android.os.RemoteException
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
_data.writeInt(status);
if ((weatherInfo!=null)) {
_data.writeInt(1);
weatherInfo.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
mRemote.transact(Stub.TRANSACTION_onWeatherRequestCompleted, _data, null, android.os.IBinder.FLAG_ONEWAY);
}
finally {
_data.recycle();
}
}
@Override public void onLookupCityRequestCompleted(cyanogenmod.weather.RequestInfo requestInfo, int status, java.util.List<cyanogenmod.weather.WeatherLocation> weatherLocation) throws android.os.RemoteException
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
_data.writeInt(status);
_data.writeTypedList(weatherLocation);
mRemote.transact(Stub.TRANSACTION_onLookupCityRequestCompleted, _data, null, android.os.IBinder.FLAG_ONEWAY);
}
finally {
_data.recycle();
}
}
}
static final int TRANSACTION_onWeatherRequestCompleted = (android.os.IBinder.FIRST_CALL_TRANSACTION + 0);
static final int TRANSACTION_onLookupCityRequestCompleted = (android.os.IBinder.FIRST_CALL_TRANSACTION + 1);
}
public void onWeatherRequestCompleted(cyanogenmod.weather.RequestInfo requestInfo, int status, cyanogenmod.weather.WeatherInfo weatherInfo) throws android.os.RemoteException;
public void onLookupCityRequestCompleted(cyanogenmod.weather.RequestInfo requestInfo, int status, java.util.List<cyanogenmod.weather.WeatherLocation> weatherLocation) throws android.os.RemoteException;
}
