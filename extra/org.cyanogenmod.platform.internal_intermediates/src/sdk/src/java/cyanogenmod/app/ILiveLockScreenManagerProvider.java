/*
 * This file is auto-generated.  DO NOT MODIFY.
 * Original file: vendor/cmsdk/sdk/src/java/cyanogenmod/app/ILiveLockScreenManagerProvider.aidl
 */
package cyanogenmod.app;
/**
 * Interface to be implemented by services that support the
 * {@link LiveLockScreenManager#SERVICE_INTERFACE}
 * @hide
 */
public interface ILiveLockScreenManagerProvider extends android.os.IInterface
{
/** No-Op implementation  */
/** @hide */
public static class NoOp implements cyanogenmod.app.ILiveLockScreenManagerProvider
{
@Override public android.os.IBinder asBinder()
{
return null;
}
/**
     * Enqueue a Live lock screen to be displayed.
     */
@Override public void enqueueLiveLockScreen(java.lang.String pkg, int id, cyanogenmod.app.LiveLockScreenInfo lls, int[] idReceived, int userId) throws android.os.RemoteException
{
}
/**
     * Cancel displaying a Live lock screen.
     */
@Override public void cancelLiveLockScreen(java.lang.String pkg, int id, int userId) throws android.os.RemoteException
{
}
/**
     * Get the current Live lock screen that should be displayed.
     */
@Override public cyanogenmod.app.LiveLockScreenInfo getCurrentLiveLockScreen() throws android.os.RemoteException
{
return null;
}
/**
     * Called when the default Live lock screen has changed.
     */
@Override public void updateDefaultLiveLockScreen(cyanogenmod.app.LiveLockScreenInfo llsInfo) throws android.os.RemoteException
{
}
/**
     * Get the enabled state of the Live lock screen feature.
     */
@Override public boolean getLiveLockScreenEnabled() throws android.os.RemoteException
{
return false;
}
/**
     * Registers an ILiveLockScreenChangeListener that will be called when the current Live lock
     * screen changes.
     */
@Override public boolean registerChangeListener(cyanogenmod.app.ILiveLockScreenChangeListener listener) throws android.os.RemoteException
{
return false;
}
/**
     * Unregisters a previously registered ILiveLockScreenChangeListener.
     */
@Override public boolean unregisterChangeListener(cyanogenmod.app.ILiveLockScreenChangeListener listener) throws android.os.RemoteException
{
return false;
}
}
/** Local-side IPC implementation stub class. */
public static abstract class Stub extends android.os.Binder implements cyanogenmod.app.ILiveLockScreenManagerProvider
{
private static final java.lang.String DESCRIPTOR = "cyanogenmod.app.ILiveLockScreenManagerProvider";
/** Construct the stub at attach it to the interface. */
public Stub()
{
this.attachInterface(this, DESCRIPTOR);
}
/**
 * Cast an IBinder object into an cyanogenmod.app.ILiveLockScreenManagerProvider interface,
 * generating a proxy if needed.
 */
public static cyanogenmod.app.ILiveLockScreenManagerProvider asInterface(android.os.IBinder obj)
{
if ((obj==null)) {
return null;
}
android.os.IInterface iin = obj.queryLocalInterface(DESCRIPTOR);
if (((iin!=null)&&(iin instanceof cyanogenmod.app.ILiveLockScreenManagerProvider))) {
return ((cyanogenmod.app.ILiveLockScreenManagerProvider)iin);
}
return new cyanogenmod.app.ILiveLockScreenManagerProvider.Stub.Proxy(obj);
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
case TRANSACTION_enqueueLiveLockScreen:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _arg0;
_arg0 = data.readString();
int _arg1;
_arg1 = data.readInt();
cyanogenmod.app.LiveLockScreenInfo _arg2;
if ((0!=data.readInt())) {
_arg2 = cyanogenmod.app.LiveLockScreenInfo.CREATOR.createFromParcel(data);
}
else {
_arg2 = null;
}
int[] _arg3;
_arg3 = data.createIntArray();
int _arg4;
_arg4 = data.readInt();
this.enqueueLiveLockScreen(_arg0, _arg1, _arg2, _arg3, _arg4);
reply.writeNoException();
reply.writeIntArray(_arg3);
return true;
}
case TRANSACTION_cancelLiveLockScreen:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _arg0;
_arg0 = data.readString();
int _arg1;
_arg1 = data.readInt();
int _arg2;
_arg2 = data.readInt();
this.cancelLiveLockScreen(_arg0, _arg1, _arg2);
reply.writeNoException();
return true;
}
case TRANSACTION_getCurrentLiveLockScreen:
{
data.enforceInterface(DESCRIPTOR);
cyanogenmod.app.LiveLockScreenInfo _result = this.getCurrentLiveLockScreen();
reply.writeNoException();
if ((_result!=null)) {
reply.writeInt(1);
_result.writeToParcel(reply, android.os.Parcelable.PARCELABLE_WRITE_RETURN_VALUE);
}
else {
reply.writeInt(0);
}
return true;
}
case TRANSACTION_updateDefaultLiveLockScreen:
{
data.enforceInterface(DESCRIPTOR);
cyanogenmod.app.LiveLockScreenInfo _arg0;
if ((0!=data.readInt())) {
_arg0 = cyanogenmod.app.LiveLockScreenInfo.CREATOR.createFromParcel(data);
}
else {
_arg0 = null;
}
this.updateDefaultLiveLockScreen(_arg0);
return true;
}
case TRANSACTION_getLiveLockScreenEnabled:
{
data.enforceInterface(DESCRIPTOR);
boolean _result = this.getLiveLockScreenEnabled();
reply.writeNoException();
reply.writeInt(((_result)?(1):(0)));
return true;
}
case TRANSACTION_registerChangeListener_5:
{
data.enforceInterface(DESCRIPTOR);
cyanogenmod.app.ILiveLockScreenChangeListener _arg0;
_arg0 = cyanogenmod.app.ILiveLockScreenChangeListener.Stub.asInterface(data.readStrongBinder());
boolean _result = this.registerChangeListener(_arg0);
reply.writeNoException();
reply.writeInt(((_result)?(1):(0)));
return true;
}
case TRANSACTION_unregisterChangeListener:
{
data.enforceInterface(DESCRIPTOR);
cyanogenmod.app.ILiveLockScreenChangeListener _arg0;
_arg0 = cyanogenmod.app.ILiveLockScreenChangeListener.Stub.asInterface(data.readStrongBinder());
boolean _result = this.unregisterChangeListener(_arg0);
reply.writeNoException();
reply.writeInt(((_result)?(1):(0)));
return true;
}
}
return super.onTransact(code, data, reply, flags);
}
private static class Proxy implements cyanogenmod.app.ILiveLockScreenManagerProvider
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
/**
     * Enqueue a Live lock screen to be displayed.
     */
@Override public void enqueueLiveLockScreen(java.lang.String pkg, int id, cyanogenmod.app.LiveLockScreenInfo lls, int[] idReceived, int userId) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeString(pkg);
_data.writeInt(id);
if ((lls!=null)) {
_data.writeInt(1);
lls.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
_data.writeIntArray(idReceived);
_data.writeInt(userId);
mRemote.transact(Stub.TRANSACTION_enqueueLiveLockScreen, _data, _reply, 0);
_reply.readException();
_reply.readIntArray(idReceived);
}
finally {
_reply.recycle();
_data.recycle();
}
}
/**
     * Cancel displaying a Live lock screen.
     */
@Override public void cancelLiveLockScreen(java.lang.String pkg, int id, int userId) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeString(pkg);
_data.writeInt(id);
_data.writeInt(userId);
mRemote.transact(Stub.TRANSACTION_cancelLiveLockScreen, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
/**
     * Get the current Live lock screen that should be displayed.
     */
@Override public cyanogenmod.app.LiveLockScreenInfo getCurrentLiveLockScreen() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
cyanogenmod.app.LiveLockScreenInfo _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_getCurrentLiveLockScreen, _data, _reply, 0);
_reply.readException();
if ((0!=_reply.readInt())) {
_result = cyanogenmod.app.LiveLockScreenInfo.CREATOR.createFromParcel(_reply);
}
else {
_result = null;
}
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
/**
     * Called when the default Live lock screen has changed.
     */
@Override public void updateDefaultLiveLockScreen(cyanogenmod.app.LiveLockScreenInfo llsInfo) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
if ((llsInfo!=null)) {
_data.writeInt(1);
llsInfo.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
mRemote.transact(Stub.TRANSACTION_updateDefaultLiveLockScreen, _data, null, android.os.IBinder.FLAG_ONEWAY);
}
finally {
_data.recycle();
}
}
/**
     * Get the enabled state of the Live lock screen feature.
     */
@Override public boolean getLiveLockScreenEnabled() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
boolean _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_getLiveLockScreenEnabled, _data, _reply, 0);
_reply.readException();
_result = (0!=_reply.readInt());
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
/**
     * Registers an ILiveLockScreenChangeListener that will be called when the current Live lock
     * screen changes.
     */
@Override public boolean registerChangeListener(cyanogenmod.app.ILiveLockScreenChangeListener listener) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
boolean _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeStrongBinder((((listener!=null))?(listener.asBinder()):(null)));
mRemote.transact(Stub.TRANSACTION_registerChangeListener_5, _data, _reply, 0);
_reply.readException();
_result = (0!=_reply.readInt());
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
/**
     * Unregisters a previously registered ILiveLockScreenChangeListener.
     */
@Override public boolean unregisterChangeListener(cyanogenmod.app.ILiveLockScreenChangeListener listener) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
boolean _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeStrongBinder((((listener!=null))?(listener.asBinder()):(null)));
mRemote.transact(Stub.TRANSACTION_unregisterChangeListener, _data, _reply, 0);
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
static final int TRANSACTION_enqueueLiveLockScreen = (android.os.IBinder.FIRST_CALL_TRANSACTION + 0);
static final int TRANSACTION_cancelLiveLockScreen = (android.os.IBinder.FIRST_CALL_TRANSACTION + 1);
static final int TRANSACTION_getCurrentLiveLockScreen = (android.os.IBinder.FIRST_CALL_TRANSACTION + 2);
static final int TRANSACTION_updateDefaultLiveLockScreen = (android.os.IBinder.FIRST_CALL_TRANSACTION + 3);
static final int TRANSACTION_getLiveLockScreenEnabled = (android.os.IBinder.FIRST_CALL_TRANSACTION + 4);
static final int TRANSACTION_registerChangeListener_5 = (android.os.IBinder.FIRST_CALL_TRANSACTION + 5);
static final int TRANSACTION_unregisterChangeListener = (android.os.IBinder.FIRST_CALL_TRANSACTION + 6);
}
/**
     * Enqueue a Live lock screen to be displayed.
     */
public void enqueueLiveLockScreen(java.lang.String pkg, int id, cyanogenmod.app.LiveLockScreenInfo lls, int[] idReceived, int userId) throws android.os.RemoteException;
/**
     * Cancel displaying a Live lock screen.
     */
public void cancelLiveLockScreen(java.lang.String pkg, int id, int userId) throws android.os.RemoteException;
/**
     * Get the current Live lock screen that should be displayed.
     */
public cyanogenmod.app.LiveLockScreenInfo getCurrentLiveLockScreen() throws android.os.RemoteException;
/**
     * Called when the default Live lock screen has changed.
     */
public void updateDefaultLiveLockScreen(cyanogenmod.app.LiveLockScreenInfo llsInfo) throws android.os.RemoteException;
/**
     * Get the enabled state of the Live lock screen feature.
     */
public boolean getLiveLockScreenEnabled() throws android.os.RemoteException;
/**
     * Registers an ILiveLockScreenChangeListener that will be called when the current Live lock
     * screen changes.
     */
public boolean registerChangeListener(cyanogenmod.app.ILiveLockScreenChangeListener listener) throws android.os.RemoteException;
/**
     * Unregisters a previously registered ILiveLockScreenChangeListener.
     */
public boolean unregisterChangeListener(cyanogenmod.app.ILiveLockScreenChangeListener listener) throws android.os.RemoteException;
}
