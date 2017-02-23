/*
 * This file is auto-generated.  DO NOT MODIFY.
 * Original file: vendor/cmsdk/sdk/src/java/cyanogenmod/weather/ICMWeatherManager.aidl
 */
package cyanogenmod.weather;
/** @hide */
public interface ICMWeatherManager extends android.os.IInterface
{
/** No-Op implementation  */
/** @hide */
public static class NoOp implements cyanogenmod.weather.ICMWeatherManager
{
@Override public android.os.IBinder asBinder()
{
return null;
}
@Override public void updateWeather(cyanogenmod.weather.RequestInfo info) throws android.os.RemoteException
{
}
@Override public void lookupCity(cyanogenmod.weather.RequestInfo info) throws android.os.RemoteException
{
}
@Override public void registerWeatherServiceProviderChangeListener(cyanogenmod.weather.IWeatherServiceProviderChangeListener listener) throws android.os.RemoteException
{
}
@Override public void unregisterWeatherServiceProviderChangeListener(cyanogenmod.weather.IWeatherServiceProviderChangeListener listener) throws android.os.RemoteException
{
}
@Override public java.lang.String getActiveWeatherServiceProviderLabel() throws android.os.RemoteException
{
return null;
}
@Override public void cancelRequest(int requestId) throws android.os.RemoteException
{
}
}
/** Local-side IPC implementation stub class. */
public static abstract class Stub extends android.os.Binder implements cyanogenmod.weather.ICMWeatherManager
{
private static final java.lang.String DESCRIPTOR = "cyanogenmod.weather.ICMWeatherManager";
/** Construct the stub at attach it to the interface. */
public Stub()
{
this.attachInterface(this, DESCRIPTOR);
}
/**
 * Cast an IBinder object into an cyanogenmod.weather.ICMWeatherManager interface,
 * generating a proxy if needed.
 */
public static cyanogenmod.weather.ICMWeatherManager asInterface(android.os.IBinder obj)
{
if ((obj==null)) {
return null;
}
android.os.IInterface iin = obj.queryLocalInterface(DESCRIPTOR);
if (((iin!=null)&&(iin instanceof cyanogenmod.weather.ICMWeatherManager))) {
return ((cyanogenmod.weather.ICMWeatherManager)iin);
}
return new cyanogenmod.weather.ICMWeatherManager.Stub.Proxy(obj);
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
case TRANSACTION_updateWeather:
{
data.enforceInterface(DESCRIPTOR);
cyanogenmod.weather.RequestInfo _arg0;
if ((0!=data.readInt())) {
_arg0 = cyanogenmod.weather.RequestInfo.CREATOR.createFromParcel(data);
}
else {
_arg0 = null;
}
this.updateWeather(_arg0);
return true;
}
case TRANSACTION_lookupCity:
{
data.enforceInterface(DESCRIPTOR);
cyanogenmod.weather.RequestInfo _arg0;
if ((0!=data.readInt())) {
_arg0 = cyanogenmod.weather.RequestInfo.CREATOR.createFromParcel(data);
}
else {
_arg0 = null;
}
this.lookupCity(_arg0);
return true;
}
case TRANSACTION_registerWeatherServiceProviderChangeListener:
{
data.enforceInterface(DESCRIPTOR);
cyanogenmod.weather.IWeatherServiceProviderChangeListener _arg0;
_arg0 = cyanogenmod.weather.IWeatherServiceProviderChangeListener.Stub.asInterface(data.readStrongBinder());
this.registerWeatherServiceProviderChangeListener(_arg0);
return true;
}
case TRANSACTION_unregisterWeatherServiceProviderChangeListener:
{
data.enforceInterface(DESCRIPTOR);
cyanogenmod.weather.IWeatherServiceProviderChangeListener _arg0;
_arg0 = cyanogenmod.weather.IWeatherServiceProviderChangeListener.Stub.asInterface(data.readStrongBinder());
this.unregisterWeatherServiceProviderChangeListener(_arg0);
return true;
}
case TRANSACTION_getActiveWeatherServiceProviderLabel:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _result = this.getActiveWeatherServiceProviderLabel();
reply.writeNoException();
reply.writeString(_result);
return true;
}
case TRANSACTION_cancelRequest:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
this.cancelRequest(_arg0);
return true;
}
}
return super.onTransact(code, data, reply, flags);
}
private static class Proxy implements cyanogenmod.weather.ICMWeatherManager
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
@Override public void updateWeather(cyanogenmod.weather.RequestInfo info) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
if ((info!=null)) {
_data.writeInt(1);
info.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
mRemote.transact(Stub.TRANSACTION_updateWeather, _data, null, android.os.IBinder.FLAG_ONEWAY);
}
finally {
_data.recycle();
}
}
@Override public void lookupCity(cyanogenmod.weather.RequestInfo info) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
if ((info!=null)) {
_data.writeInt(1);
info.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
mRemote.transact(Stub.TRANSACTION_lookupCity, _data, null, android.os.IBinder.FLAG_ONEWAY);
}
finally {
_data.recycle();
}
}
@Override public void registerWeatherServiceProviderChangeListener(cyanogenmod.weather.IWeatherServiceProviderChangeListener listener) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeStrongBinder((((listener!=null))?(listener.asBinder()):(null)));
mRemote.transact(Stub.TRANSACTION_registerWeatherServiceProviderChangeListener, _data, null, android.os.IBinder.FLAG_ONEWAY);
}
finally {
_data.recycle();
}
}
@Override public void unregisterWeatherServiceProviderChangeListener(cyanogenmod.weather.IWeatherServiceProviderChangeListener listener) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeStrongBinder((((listener!=null))?(listener.asBinder()):(null)));
mRemote.transact(Stub.TRANSACTION_unregisterWeatherServiceProviderChangeListener, _data, null, android.os.IBinder.FLAG_ONEWAY);
}
finally {
_data.recycle();
}
}
@Override public java.lang.String getActiveWeatherServiceProviderLabel() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
java.lang.String _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_getActiveWeatherServiceProviderLabel, _data, _reply, 0);
_reply.readException();
_result = _reply.readString();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public void cancelRequest(int requestId) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(requestId);
mRemote.transact(Stub.TRANSACTION_cancelRequest, _data, null, android.os.IBinder.FLAG_ONEWAY);
}
finally {
_data.recycle();
}
}
}
static final int TRANSACTION_updateWeather = (android.os.IBinder.FIRST_CALL_TRANSACTION + 0);
static final int TRANSACTION_lookupCity = (android.os.IBinder.FIRST_CALL_TRANSACTION + 1);
static final int TRANSACTION_registerWeatherServiceProviderChangeListener = (android.os.IBinder.FIRST_CALL_TRANSACTION + 2);
static final int TRANSACTION_unregisterWeatherServiceProviderChangeListener = (android.os.IBinder.FIRST_CALL_TRANSACTION + 3);
static final int TRANSACTION_getActiveWeatherServiceProviderLabel = (android.os.IBinder.FIRST_CALL_TRANSACTION + 4);
static final int TRANSACTION_cancelRequest = (android.os.IBinder.FIRST_CALL_TRANSACTION + 5);
}
public void updateWeather(cyanogenmod.weather.RequestInfo info) throws android.os.RemoteException;
public void lookupCity(cyanogenmod.weather.RequestInfo info) throws android.os.RemoteException;
public void registerWeatherServiceProviderChangeListener(cyanogenmod.weather.IWeatherServiceProviderChangeListener listener) throws android.os.RemoteException;
public void unregisterWeatherServiceProviderChangeListener(cyanogenmod.weather.IWeatherServiceProviderChangeListener listener) throws android.os.RemoteException;
public java.lang.String getActiveWeatherServiceProviderLabel() throws android.os.RemoteException;
public void cancelRequest(int requestId) throws android.os.RemoteException;
}
