/*
 * This file is auto-generated.  DO NOT MODIFY.
 * Original file: vendor/cmsdk/sdk/src/java/cyanogenmod/weatherservice/IWeatherProviderService.aidl
 */
package cyanogenmod.weatherservice;
/** @hide */
public interface IWeatherProviderService extends android.os.IInterface
{
/** No-Op implementation  */
/** @hide */
public static class NoOp implements cyanogenmod.weatherservice.IWeatherProviderService
{
@Override public android.os.IBinder asBinder()
{
return null;
}
@Override public void processWeatherUpdateRequest(cyanogenmod.weather.RequestInfo request) throws android.os.RemoteException
{
}
@Override public void processCityNameLookupRequest(cyanogenmod.weather.RequestInfo request) throws android.os.RemoteException
{
}
@Override public void setServiceClient(cyanogenmod.weatherservice.IWeatherProviderServiceClient client) throws android.os.RemoteException
{
}
@Override public void cancelOngoingRequests() throws android.os.RemoteException
{
}
@Override public void cancelRequest(int requestId) throws android.os.RemoteException
{
}
}
/** Local-side IPC implementation stub class. */
public static abstract class Stub extends android.os.Binder implements cyanogenmod.weatherservice.IWeatherProviderService
{
private static final java.lang.String DESCRIPTOR = "cyanogenmod.weatherservice.IWeatherProviderService";
/** Construct the stub at attach it to the interface. */
public Stub()
{
this.attachInterface(this, DESCRIPTOR);
}
/**
 * Cast an IBinder object into an cyanogenmod.weatherservice.IWeatherProviderService interface,
 * generating a proxy if needed.
 */
public static cyanogenmod.weatherservice.IWeatherProviderService asInterface(android.os.IBinder obj)
{
if ((obj==null)) {
return null;
}
android.os.IInterface iin = obj.queryLocalInterface(DESCRIPTOR);
if (((iin!=null)&&(iin instanceof cyanogenmod.weatherservice.IWeatherProviderService))) {
return ((cyanogenmod.weatherservice.IWeatherProviderService)iin);
}
return new cyanogenmod.weatherservice.IWeatherProviderService.Stub.Proxy(obj);
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
case TRANSACTION_processWeatherUpdateRequest:
{
data.enforceInterface(DESCRIPTOR);
cyanogenmod.weather.RequestInfo _arg0;
if ((0!=data.readInt())) {
_arg0 = cyanogenmod.weather.RequestInfo.CREATOR.createFromParcel(data);
}
else {
_arg0 = null;
}
this.processWeatherUpdateRequest(_arg0);
return true;
}
case TRANSACTION_processCityNameLookupRequest:
{
data.enforceInterface(DESCRIPTOR);
cyanogenmod.weather.RequestInfo _arg0;
if ((0!=data.readInt())) {
_arg0 = cyanogenmod.weather.RequestInfo.CREATOR.createFromParcel(data);
}
else {
_arg0 = null;
}
this.processCityNameLookupRequest(_arg0);
return true;
}
case TRANSACTION_setServiceClient:
{
data.enforceInterface(DESCRIPTOR);
cyanogenmod.weatherservice.IWeatherProviderServiceClient _arg0;
_arg0 = cyanogenmod.weatherservice.IWeatherProviderServiceClient.Stub.asInterface(data.readStrongBinder());
this.setServiceClient(_arg0);
return true;
}
case TRANSACTION_cancelOngoingRequests:
{
data.enforceInterface(DESCRIPTOR);
this.cancelOngoingRequests();
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
private static class Proxy implements cyanogenmod.weatherservice.IWeatherProviderService
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
@Override public void processWeatherUpdateRequest(cyanogenmod.weather.RequestInfo request) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
if ((request!=null)) {
_data.writeInt(1);
request.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
mRemote.transact(Stub.TRANSACTION_processWeatherUpdateRequest, _data, null, android.os.IBinder.FLAG_ONEWAY);
}
finally {
_data.recycle();
}
}
@Override public void processCityNameLookupRequest(cyanogenmod.weather.RequestInfo request) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
if ((request!=null)) {
_data.writeInt(1);
request.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
mRemote.transact(Stub.TRANSACTION_processCityNameLookupRequest, _data, null, android.os.IBinder.FLAG_ONEWAY);
}
finally {
_data.recycle();
}
}
@Override public void setServiceClient(cyanogenmod.weatherservice.IWeatherProviderServiceClient client) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeStrongBinder((((client!=null))?(client.asBinder()):(null)));
mRemote.transact(Stub.TRANSACTION_setServiceClient, _data, null, android.os.IBinder.FLAG_ONEWAY);
}
finally {
_data.recycle();
}
}
@Override public void cancelOngoingRequests() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_cancelOngoingRequests, _data, null, android.os.IBinder.FLAG_ONEWAY);
}
finally {
_data.recycle();
}
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
static final int TRANSACTION_processWeatherUpdateRequest = (android.os.IBinder.FIRST_CALL_TRANSACTION + 0);
static final int TRANSACTION_processCityNameLookupRequest = (android.os.IBinder.FIRST_CALL_TRANSACTION + 1);
static final int TRANSACTION_setServiceClient = (android.os.IBinder.FIRST_CALL_TRANSACTION + 2);
static final int TRANSACTION_cancelOngoingRequests = (android.os.IBinder.FIRST_CALL_TRANSACTION + 3);
static final int TRANSACTION_cancelRequest = (android.os.IBinder.FIRST_CALL_TRANSACTION + 4);
}
public void processWeatherUpdateRequest(cyanogenmod.weather.RequestInfo request) throws android.os.RemoteException;
public void processCityNameLookupRequest(cyanogenmod.weather.RequestInfo request) throws android.os.RemoteException;
public void setServiceClient(cyanogenmod.weatherservice.IWeatherProviderServiceClient client) throws android.os.RemoteException;
public void cancelOngoingRequests() throws android.os.RemoteException;
public void cancelRequest(int requestId) throws android.os.RemoteException;
}
