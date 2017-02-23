/*
 * This file is auto-generated.  DO NOT MODIFY.
 * Original file: vendor/cmsdk/sdk/src/java/cyanogenmod/themes/IThemeService.aidl
 */
package cyanogenmod.themes;
/** {@hide} */
public interface IThemeService extends android.os.IInterface
{
/** No-Op implementation  */
/** @hide */
public static class NoOp implements cyanogenmod.themes.IThemeService
{
@Override public android.os.IBinder asBinder()
{
return null;
}
@Override public void requestThemeChangeUpdates(cyanogenmod.themes.IThemeChangeListener listener) throws android.os.RemoteException
{
}
@Override public void removeUpdates(cyanogenmod.themes.IThemeChangeListener listener) throws android.os.RemoteException
{
}
@Override public void requestThemeChange(cyanogenmod.themes.ThemeChangeRequest request, boolean removePerAppThemes) throws android.os.RemoteException
{
}
@Override public void applyDefaultTheme() throws android.os.RemoteException
{
}
@Override public boolean isThemeApplying() throws android.os.RemoteException
{
return false;
}
@Override public int getProgress() throws android.os.RemoteException
{
return 0;
}
@Override public boolean processThemeResources(java.lang.String themePkgName) throws android.os.RemoteException
{
return false;
}
@Override public boolean isThemeBeingProcessed(java.lang.String themePkgName) throws android.os.RemoteException
{
return false;
}
@Override public void registerThemeProcessingListener(cyanogenmod.themes.IThemeProcessingListener listener) throws android.os.RemoteException
{
}
@Override public void unregisterThemeProcessingListener(cyanogenmod.themes.IThemeProcessingListener listener) throws android.os.RemoteException
{
}
@Override public void rebuildResourceCache() throws android.os.RemoteException
{
}
@Override public long getLastThemeChangeTime() throws android.os.RemoteException
{
return 0;
}
@Override public int getLastThemeChangeRequestType() throws android.os.RemoteException
{
return 0;
}
}
/** Local-side IPC implementation stub class. */
public static abstract class Stub extends android.os.Binder implements cyanogenmod.themes.IThemeService
{
private static final java.lang.String DESCRIPTOR = "cyanogenmod.themes.IThemeService";
/** Construct the stub at attach it to the interface. */
public Stub()
{
this.attachInterface(this, DESCRIPTOR);
}
/**
 * Cast an IBinder object into an cyanogenmod.themes.IThemeService interface,
 * generating a proxy if needed.
 */
public static cyanogenmod.themes.IThemeService asInterface(android.os.IBinder obj)
{
if ((obj==null)) {
return null;
}
android.os.IInterface iin = obj.queryLocalInterface(DESCRIPTOR);
if (((iin!=null)&&(iin instanceof cyanogenmod.themes.IThemeService))) {
return ((cyanogenmod.themes.IThemeService)iin);
}
return new cyanogenmod.themes.IThemeService.Stub.Proxy(obj);
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
case TRANSACTION_requestThemeChangeUpdates:
{
data.enforceInterface(DESCRIPTOR);
cyanogenmod.themes.IThemeChangeListener _arg0;
_arg0 = cyanogenmod.themes.IThemeChangeListener.Stub.asInterface(data.readStrongBinder());
this.requestThemeChangeUpdates(_arg0);
return true;
}
case TRANSACTION_removeUpdates:
{
data.enforceInterface(DESCRIPTOR);
cyanogenmod.themes.IThemeChangeListener _arg0;
_arg0 = cyanogenmod.themes.IThemeChangeListener.Stub.asInterface(data.readStrongBinder());
this.removeUpdates(_arg0);
return true;
}
case TRANSACTION_requestThemeChange:
{
data.enforceInterface(DESCRIPTOR);
cyanogenmod.themes.ThemeChangeRequest _arg0;
if ((0!=data.readInt())) {
_arg0 = cyanogenmod.themes.ThemeChangeRequest.CREATOR.createFromParcel(data);
}
else {
_arg0 = null;
}
boolean _arg1;
_arg1 = (0!=data.readInt());
this.requestThemeChange(_arg0, _arg1);
return true;
}
case TRANSACTION_applyDefaultTheme:
{
data.enforceInterface(DESCRIPTOR);
this.applyDefaultTheme();
return true;
}
case TRANSACTION_isThemeApplying:
{
data.enforceInterface(DESCRIPTOR);
boolean _result = this.isThemeApplying();
reply.writeNoException();
reply.writeInt(((_result)?(1):(0)));
return true;
}
case TRANSACTION_getProgress:
{
data.enforceInterface(DESCRIPTOR);
int _result = this.getProgress();
reply.writeNoException();
reply.writeInt(_result);
return true;
}
case TRANSACTION_processThemeResources:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _arg0;
_arg0 = data.readString();
boolean _result = this.processThemeResources(_arg0);
reply.writeNoException();
reply.writeInt(((_result)?(1):(0)));
return true;
}
case TRANSACTION_isThemeBeingProcessed:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _arg0;
_arg0 = data.readString();
boolean _result = this.isThemeBeingProcessed(_arg0);
reply.writeNoException();
reply.writeInt(((_result)?(1):(0)));
return true;
}
case TRANSACTION_registerThemeProcessingListener:
{
data.enforceInterface(DESCRIPTOR);
cyanogenmod.themes.IThemeProcessingListener _arg0;
_arg0 = cyanogenmod.themes.IThemeProcessingListener.Stub.asInterface(data.readStrongBinder());
this.registerThemeProcessingListener(_arg0);
return true;
}
case TRANSACTION_unregisterThemeProcessingListener:
{
data.enforceInterface(DESCRIPTOR);
cyanogenmod.themes.IThemeProcessingListener _arg0;
_arg0 = cyanogenmod.themes.IThemeProcessingListener.Stub.asInterface(data.readStrongBinder());
this.unregisterThemeProcessingListener(_arg0);
return true;
}
case TRANSACTION_rebuildResourceCache:
{
data.enforceInterface(DESCRIPTOR);
this.rebuildResourceCache();
return true;
}
case TRANSACTION_getLastThemeChangeTime:
{
data.enforceInterface(DESCRIPTOR);
long _result = this.getLastThemeChangeTime();
reply.writeNoException();
reply.writeLong(_result);
return true;
}
case TRANSACTION_getLastThemeChangeRequestType:
{
data.enforceInterface(DESCRIPTOR);
int _result = this.getLastThemeChangeRequestType();
reply.writeNoException();
reply.writeInt(_result);
return true;
}
}
return super.onTransact(code, data, reply, flags);
}
private static class Proxy implements cyanogenmod.themes.IThemeService
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
@Override public void requestThemeChangeUpdates(cyanogenmod.themes.IThemeChangeListener listener) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeStrongBinder((((listener!=null))?(listener.asBinder()):(null)));
mRemote.transact(Stub.TRANSACTION_requestThemeChangeUpdates, _data, null, android.os.IBinder.FLAG_ONEWAY);
}
finally {
_data.recycle();
}
}
@Override public void removeUpdates(cyanogenmod.themes.IThemeChangeListener listener) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeStrongBinder((((listener!=null))?(listener.asBinder()):(null)));
mRemote.transact(Stub.TRANSACTION_removeUpdates, _data, null, android.os.IBinder.FLAG_ONEWAY);
}
finally {
_data.recycle();
}
}
@Override public void requestThemeChange(cyanogenmod.themes.ThemeChangeRequest request, boolean removePerAppThemes) throws android.os.RemoteException
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
_data.writeInt(((removePerAppThemes)?(1):(0)));
mRemote.transact(Stub.TRANSACTION_requestThemeChange, _data, null, android.os.IBinder.FLAG_ONEWAY);
}
finally {
_data.recycle();
}
}
@Override public void applyDefaultTheme() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_applyDefaultTheme, _data, null, android.os.IBinder.FLAG_ONEWAY);
}
finally {
_data.recycle();
}
}
@Override public boolean isThemeApplying() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
boolean _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_isThemeApplying, _data, _reply, 0);
_reply.readException();
_result = (0!=_reply.readInt());
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public int getProgress() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
int _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_getProgress, _data, _reply, 0);
_reply.readException();
_result = _reply.readInt();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public boolean processThemeResources(java.lang.String themePkgName) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
boolean _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeString(themePkgName);
mRemote.transact(Stub.TRANSACTION_processThemeResources, _data, _reply, 0);
_reply.readException();
_result = (0!=_reply.readInt());
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public boolean isThemeBeingProcessed(java.lang.String themePkgName) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
boolean _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeString(themePkgName);
mRemote.transact(Stub.TRANSACTION_isThemeBeingProcessed, _data, _reply, 0);
_reply.readException();
_result = (0!=_reply.readInt());
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public void registerThemeProcessingListener(cyanogenmod.themes.IThemeProcessingListener listener) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeStrongBinder((((listener!=null))?(listener.asBinder()):(null)));
mRemote.transact(Stub.TRANSACTION_registerThemeProcessingListener, _data, null, android.os.IBinder.FLAG_ONEWAY);
}
finally {
_data.recycle();
}
}
@Override public void unregisterThemeProcessingListener(cyanogenmod.themes.IThemeProcessingListener listener) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeStrongBinder((((listener!=null))?(listener.asBinder()):(null)));
mRemote.transact(Stub.TRANSACTION_unregisterThemeProcessingListener, _data, null, android.os.IBinder.FLAG_ONEWAY);
}
finally {
_data.recycle();
}
}
@Override public void rebuildResourceCache() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_rebuildResourceCache, _data, null, android.os.IBinder.FLAG_ONEWAY);
}
finally {
_data.recycle();
}
}
@Override public long getLastThemeChangeTime() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
long _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_getLastThemeChangeTime, _data, _reply, 0);
_reply.readException();
_result = _reply.readLong();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public int getLastThemeChangeRequestType() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
int _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_getLastThemeChangeRequestType, _data, _reply, 0);
_reply.readException();
_result = _reply.readInt();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
}
static final int TRANSACTION_requestThemeChangeUpdates = (android.os.IBinder.FIRST_CALL_TRANSACTION + 0);
static final int TRANSACTION_removeUpdates = (android.os.IBinder.FIRST_CALL_TRANSACTION + 1);
static final int TRANSACTION_requestThemeChange = (android.os.IBinder.FIRST_CALL_TRANSACTION + 2);
static final int TRANSACTION_applyDefaultTheme = (android.os.IBinder.FIRST_CALL_TRANSACTION + 3);
static final int TRANSACTION_isThemeApplying = (android.os.IBinder.FIRST_CALL_TRANSACTION + 4);
static final int TRANSACTION_getProgress = (android.os.IBinder.FIRST_CALL_TRANSACTION + 5);
static final int TRANSACTION_processThemeResources = (android.os.IBinder.FIRST_CALL_TRANSACTION + 6);
static final int TRANSACTION_isThemeBeingProcessed = (android.os.IBinder.FIRST_CALL_TRANSACTION + 7);
static final int TRANSACTION_registerThemeProcessingListener = (android.os.IBinder.FIRST_CALL_TRANSACTION + 8);
static final int TRANSACTION_unregisterThemeProcessingListener = (android.os.IBinder.FIRST_CALL_TRANSACTION + 9);
static final int TRANSACTION_rebuildResourceCache = (android.os.IBinder.FIRST_CALL_TRANSACTION + 10);
static final int TRANSACTION_getLastThemeChangeTime = (android.os.IBinder.FIRST_CALL_TRANSACTION + 11);
static final int TRANSACTION_getLastThemeChangeRequestType = (android.os.IBinder.FIRST_CALL_TRANSACTION + 12);
}
public void requestThemeChangeUpdates(cyanogenmod.themes.IThemeChangeListener listener) throws android.os.RemoteException;
public void removeUpdates(cyanogenmod.themes.IThemeChangeListener listener) throws android.os.RemoteException;
public void requestThemeChange(cyanogenmod.themes.ThemeChangeRequest request, boolean removePerAppThemes) throws android.os.RemoteException;
public void applyDefaultTheme() throws android.os.RemoteException;
public boolean isThemeApplying() throws android.os.RemoteException;
public int getProgress() throws android.os.RemoteException;
public boolean processThemeResources(java.lang.String themePkgName) throws android.os.RemoteException;
public boolean isThemeBeingProcessed(java.lang.String themePkgName) throws android.os.RemoteException;
public void registerThemeProcessingListener(cyanogenmod.themes.IThemeProcessingListener listener) throws android.os.RemoteException;
public void unregisterThemeProcessingListener(cyanogenmod.themes.IThemeProcessingListener listener) throws android.os.RemoteException;
public void rebuildResourceCache() throws android.os.RemoteException;
public long getLastThemeChangeTime() throws android.os.RemoteException;
public int getLastThemeChangeRequestType() throws android.os.RemoteException;
}
