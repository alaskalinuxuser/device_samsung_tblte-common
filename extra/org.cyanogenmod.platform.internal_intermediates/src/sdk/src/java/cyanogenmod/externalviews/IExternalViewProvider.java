/*
 * This file is auto-generated.  DO NOT MODIFY.
 * Original file: vendor/cmsdk/sdk/src/java/cyanogenmod/externalviews/IExternalViewProvider.aidl
 */
package cyanogenmod.externalviews;
/** @hide */
public interface IExternalViewProvider extends android.os.IInterface
{
/** No-Op implementation  */
/** @hide */
public static class NoOp implements cyanogenmod.externalviews.IExternalViewProvider
{
@Override public android.os.IBinder asBinder()
{
return null;
}
@Override public void onAttach(android.os.IBinder windowToken) throws android.os.RemoteException
{
}
@Override public void onStart() throws android.os.RemoteException
{
}
@Override public void onResume() throws android.os.RemoteException
{
}
@Override public void onPause() throws android.os.RemoteException
{
}
@Override public void onStop() throws android.os.RemoteException
{
}
@Override public void onDetach() throws android.os.RemoteException
{
}
@Override public void alterWindow(int x, int y, int width, int height, boolean visible, android.graphics.Rect clipRect) throws android.os.RemoteException
{
}
}
/** Local-side IPC implementation stub class. */
public static abstract class Stub extends android.os.Binder implements cyanogenmod.externalviews.IExternalViewProvider
{
private static final java.lang.String DESCRIPTOR = "cyanogenmod.externalviews.IExternalViewProvider";
/** Construct the stub at attach it to the interface. */
public Stub()
{
this.attachInterface(this, DESCRIPTOR);
}
/**
 * Cast an IBinder object into an cyanogenmod.externalviews.IExternalViewProvider interface,
 * generating a proxy if needed.
 */
public static cyanogenmod.externalviews.IExternalViewProvider asInterface(android.os.IBinder obj)
{
if ((obj==null)) {
return null;
}
android.os.IInterface iin = obj.queryLocalInterface(DESCRIPTOR);
if (((iin!=null)&&(iin instanceof cyanogenmod.externalviews.IExternalViewProvider))) {
return ((cyanogenmod.externalviews.IExternalViewProvider)iin);
}
return new cyanogenmod.externalviews.IExternalViewProvider.Stub.Proxy(obj);
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
case TRANSACTION_onAttach_0:
{
data.enforceInterface(DESCRIPTOR);
android.os.IBinder _arg0;
_arg0 = data.readStrongBinder();
this.onAttach(_arg0);
return true;
}
case TRANSACTION_onStart:
{
data.enforceInterface(DESCRIPTOR);
this.onStart();
return true;
}
case TRANSACTION_onResume:
{
data.enforceInterface(DESCRIPTOR);
this.onResume();
return true;
}
case TRANSACTION_onPause:
{
data.enforceInterface(DESCRIPTOR);
this.onPause();
return true;
}
case TRANSACTION_onStop:
{
data.enforceInterface(DESCRIPTOR);
this.onStop();
return true;
}
case TRANSACTION_onDetach:
{
data.enforceInterface(DESCRIPTOR);
this.onDetach();
return true;
}
case TRANSACTION_alterWindow:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
int _arg1;
_arg1 = data.readInt();
int _arg2;
_arg2 = data.readInt();
int _arg3;
_arg3 = data.readInt();
boolean _arg4;
_arg4 = (0!=data.readInt());
android.graphics.Rect _arg5;
if ((0!=data.readInt())) {
_arg5 = android.graphics.Rect.CREATOR.createFromParcel(data);
}
else {
_arg5 = null;
}
this.alterWindow(_arg0, _arg1, _arg2, _arg3, _arg4, _arg5);
reply.writeNoException();
return true;
}
}
return super.onTransact(code, data, reply, flags);
}
private static class Proxy implements cyanogenmod.externalviews.IExternalViewProvider
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
@Override public void onAttach(android.os.IBinder windowToken) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeStrongBinder(windowToken);
mRemote.transact(Stub.TRANSACTION_onAttach_0, _data, null, android.os.IBinder.FLAG_ONEWAY);
}
finally {
_data.recycle();
}
}
@Override public void onStart() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_onStart, _data, null, android.os.IBinder.FLAG_ONEWAY);
}
finally {
_data.recycle();
}
}
@Override public void onResume() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_onResume, _data, null, android.os.IBinder.FLAG_ONEWAY);
}
finally {
_data.recycle();
}
}
@Override public void onPause() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_onPause, _data, null, android.os.IBinder.FLAG_ONEWAY);
}
finally {
_data.recycle();
}
}
@Override public void onStop() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_onStop, _data, null, android.os.IBinder.FLAG_ONEWAY);
}
finally {
_data.recycle();
}
}
@Override public void onDetach() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_onDetach, _data, null, android.os.IBinder.FLAG_ONEWAY);
}
finally {
_data.recycle();
}
}
@Override public void alterWindow(int x, int y, int width, int height, boolean visible, android.graphics.Rect clipRect) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(x);
_data.writeInt(y);
_data.writeInt(width);
_data.writeInt(height);
_data.writeInt(((visible)?(1):(0)));
if ((clipRect!=null)) {
_data.writeInt(1);
clipRect.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
mRemote.transact(Stub.TRANSACTION_alterWindow, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
}
static final int TRANSACTION_onAttach_0 = (android.os.IBinder.FIRST_CALL_TRANSACTION + 0);
static final int TRANSACTION_onStart = (android.os.IBinder.FIRST_CALL_TRANSACTION + 1);
static final int TRANSACTION_onResume = (android.os.IBinder.FIRST_CALL_TRANSACTION + 2);
static final int TRANSACTION_onPause = (android.os.IBinder.FIRST_CALL_TRANSACTION + 3);
static final int TRANSACTION_onStop = (android.os.IBinder.FIRST_CALL_TRANSACTION + 4);
static final int TRANSACTION_onDetach = (android.os.IBinder.FIRST_CALL_TRANSACTION + 5);
static final int TRANSACTION_alterWindow = (android.os.IBinder.FIRST_CALL_TRANSACTION + 6);
}
public void onAttach(android.os.IBinder windowToken) throws android.os.RemoteException;
public void onStart() throws android.os.RemoteException;
public void onResume() throws android.os.RemoteException;
public void onPause() throws android.os.RemoteException;
public void onStop() throws android.os.RemoteException;
public void onDetach() throws android.os.RemoteException;
public void alterWindow(int x, int y, int width, int height, boolean visible, android.graphics.Rect clipRect) throws android.os.RemoteException;
}
