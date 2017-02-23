/*
 * This file is auto-generated.  DO NOT MODIFY.
 * Original file: vendor/cmsdk/sdk/src/java/cyanogenmod/app/ICMStatusBarManager.aidl
 */
package cyanogenmod.app;
/** @hide */
public interface ICMStatusBarManager extends android.os.IInterface
{
/** No-Op implementation  */
/** @hide */
public static class NoOp implements cyanogenmod.app.ICMStatusBarManager
{
@Override public android.os.IBinder asBinder()
{
return null;
}
// --- Methods below are for use by 3rd party applications to publish quick
// settings tiles to the status bar panel
// You need the PUBLISH_CUSTOM_TILE permission

@Override public void createCustomTileWithTag(java.lang.String pkg, java.lang.String opPkg, java.lang.String tag, int id, cyanogenmod.app.CustomTile tile, int[] idReceived, int userId) throws android.os.RemoteException
{
}
@Override public void removeCustomTileWithTag(java.lang.String pkg, java.lang.String tag, int id, int userId) throws android.os.RemoteException
{
}
// --- Methods below are for use by 3rd party applications
// You need the BIND_QUICK_SETTINGS_TILE_LISTENER permission

@Override public void registerListener(cyanogenmod.app.ICustomTileListener listener, android.content.ComponentName component, int userid) throws android.os.RemoteException
{
}
@Override public void unregisterListener(cyanogenmod.app.ICustomTileListener listener, int userid) throws android.os.RemoteException
{
}
@Override public void removeCustomTileFromListener(cyanogenmod.app.ICustomTileListener listener, java.lang.String pkg, java.lang.String tag, int id) throws android.os.RemoteException
{
}
}
/** Local-side IPC implementation stub class. */
public static abstract class Stub extends android.os.Binder implements cyanogenmod.app.ICMStatusBarManager
{
private static final java.lang.String DESCRIPTOR = "cyanogenmod.app.ICMStatusBarManager";
/** Construct the stub at attach it to the interface. */
public Stub()
{
this.attachInterface(this, DESCRIPTOR);
}
/**
 * Cast an IBinder object into an cyanogenmod.app.ICMStatusBarManager interface,
 * generating a proxy if needed.
 */
public static cyanogenmod.app.ICMStatusBarManager asInterface(android.os.IBinder obj)
{
if ((obj==null)) {
return null;
}
android.os.IInterface iin = obj.queryLocalInterface(DESCRIPTOR);
if (((iin!=null)&&(iin instanceof cyanogenmod.app.ICMStatusBarManager))) {
return ((cyanogenmod.app.ICMStatusBarManager)iin);
}
return new cyanogenmod.app.ICMStatusBarManager.Stub.Proxy(obj);
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
case TRANSACTION_createCustomTileWithTag:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _arg0;
_arg0 = data.readString();
java.lang.String _arg1;
_arg1 = data.readString();
java.lang.String _arg2;
_arg2 = data.readString();
int _arg3;
_arg3 = data.readInt();
cyanogenmod.app.CustomTile _arg4;
if ((0!=data.readInt())) {
_arg4 = cyanogenmod.app.CustomTile.CREATOR.createFromParcel(data);
}
else {
_arg4 = null;
}
int[] _arg5;
_arg5 = data.createIntArray();
int _arg6;
_arg6 = data.readInt();
this.createCustomTileWithTag(_arg0, _arg1, _arg2, _arg3, _arg4, _arg5, _arg6);
reply.writeNoException();
reply.writeIntArray(_arg5);
return true;
}
case TRANSACTION_removeCustomTileWithTag:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _arg0;
_arg0 = data.readString();
java.lang.String _arg1;
_arg1 = data.readString();
int _arg2;
_arg2 = data.readInt();
int _arg3;
_arg3 = data.readInt();
this.removeCustomTileWithTag(_arg0, _arg1, _arg2, _arg3);
reply.writeNoException();
return true;
}
case TRANSACTION_registerListener:
{
data.enforceInterface(DESCRIPTOR);
cyanogenmod.app.ICustomTileListener _arg0;
_arg0 = cyanogenmod.app.ICustomTileListener.Stub.asInterface(data.readStrongBinder());
android.content.ComponentName _arg1;
if ((0!=data.readInt())) {
_arg1 = android.content.ComponentName.CREATOR.createFromParcel(data);
}
else {
_arg1 = null;
}
int _arg2;
_arg2 = data.readInt();
this.registerListener(_arg0, _arg1, _arg2);
reply.writeNoException();
return true;
}
case TRANSACTION_unregisterListener:
{
data.enforceInterface(DESCRIPTOR);
cyanogenmod.app.ICustomTileListener _arg0;
_arg0 = cyanogenmod.app.ICustomTileListener.Stub.asInterface(data.readStrongBinder());
int _arg1;
_arg1 = data.readInt();
this.unregisterListener(_arg0, _arg1);
reply.writeNoException();
return true;
}
case TRANSACTION_removeCustomTileFromListener:
{
data.enforceInterface(DESCRIPTOR);
cyanogenmod.app.ICustomTileListener _arg0;
_arg0 = cyanogenmod.app.ICustomTileListener.Stub.asInterface(data.readStrongBinder());
java.lang.String _arg1;
_arg1 = data.readString();
java.lang.String _arg2;
_arg2 = data.readString();
int _arg3;
_arg3 = data.readInt();
this.removeCustomTileFromListener(_arg0, _arg1, _arg2, _arg3);
reply.writeNoException();
return true;
}
}
return super.onTransact(code, data, reply, flags);
}
private static class Proxy implements cyanogenmod.app.ICMStatusBarManager
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
// --- Methods below are for use by 3rd party applications to publish quick
// settings tiles to the status bar panel
// You need the PUBLISH_CUSTOM_TILE permission

@Override public void createCustomTileWithTag(java.lang.String pkg, java.lang.String opPkg, java.lang.String tag, int id, cyanogenmod.app.CustomTile tile, int[] idReceived, int userId) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeString(pkg);
_data.writeString(opPkg);
_data.writeString(tag);
_data.writeInt(id);
if ((tile!=null)) {
_data.writeInt(1);
tile.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
_data.writeIntArray(idReceived);
_data.writeInt(userId);
mRemote.transact(Stub.TRANSACTION_createCustomTileWithTag, _data, _reply, 0);
_reply.readException();
_reply.readIntArray(idReceived);
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public void removeCustomTileWithTag(java.lang.String pkg, java.lang.String tag, int id, int userId) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeString(pkg);
_data.writeString(tag);
_data.writeInt(id);
_data.writeInt(userId);
mRemote.transact(Stub.TRANSACTION_removeCustomTileWithTag, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
// --- Methods below are for use by 3rd party applications
// You need the BIND_QUICK_SETTINGS_TILE_LISTENER permission

@Override public void registerListener(cyanogenmod.app.ICustomTileListener listener, android.content.ComponentName component, int userid) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeStrongBinder((((listener!=null))?(listener.asBinder()):(null)));
if ((component!=null)) {
_data.writeInt(1);
component.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
_data.writeInt(userid);
mRemote.transact(Stub.TRANSACTION_registerListener, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public void unregisterListener(cyanogenmod.app.ICustomTileListener listener, int userid) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeStrongBinder((((listener!=null))?(listener.asBinder()):(null)));
_data.writeInt(userid);
mRemote.transact(Stub.TRANSACTION_unregisterListener, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public void removeCustomTileFromListener(cyanogenmod.app.ICustomTileListener listener, java.lang.String pkg, java.lang.String tag, int id) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeStrongBinder((((listener!=null))?(listener.asBinder()):(null)));
_data.writeString(pkg);
_data.writeString(tag);
_data.writeInt(id);
mRemote.transact(Stub.TRANSACTION_removeCustomTileFromListener, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
}
static final int TRANSACTION_createCustomTileWithTag = (android.os.IBinder.FIRST_CALL_TRANSACTION + 0);
static final int TRANSACTION_removeCustomTileWithTag = (android.os.IBinder.FIRST_CALL_TRANSACTION + 1);
static final int TRANSACTION_registerListener = (android.os.IBinder.FIRST_CALL_TRANSACTION + 2);
static final int TRANSACTION_unregisterListener = (android.os.IBinder.FIRST_CALL_TRANSACTION + 3);
static final int TRANSACTION_removeCustomTileFromListener = (android.os.IBinder.FIRST_CALL_TRANSACTION + 4);
}
// --- Methods below are for use by 3rd party applications to publish quick
// settings tiles to the status bar panel
// You need the PUBLISH_CUSTOM_TILE permission

public void createCustomTileWithTag(java.lang.String pkg, java.lang.String opPkg, java.lang.String tag, int id, cyanogenmod.app.CustomTile tile, int[] idReceived, int userId) throws android.os.RemoteException;
public void removeCustomTileWithTag(java.lang.String pkg, java.lang.String tag, int id, int userId) throws android.os.RemoteException;
// --- Methods below are for use by 3rd party applications
// You need the BIND_QUICK_SETTINGS_TILE_LISTENER permission

public void registerListener(cyanogenmod.app.ICustomTileListener listener, android.content.ComponentName component, int userid) throws android.os.RemoteException;
public void unregisterListener(cyanogenmod.app.ICustomTileListener listener, int userid) throws android.os.RemoteException;
public void removeCustomTileFromListener(cyanogenmod.app.ICustomTileListener listener, java.lang.String pkg, java.lang.String tag, int id) throws android.os.RemoteException;
}
