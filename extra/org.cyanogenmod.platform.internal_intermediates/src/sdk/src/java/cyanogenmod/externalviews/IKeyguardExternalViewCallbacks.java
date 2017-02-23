/*
 * This file is auto-generated.  DO NOT MODIFY.
 * Original file: vendor/cmsdk/sdk/src/java/cyanogenmod/externalviews/IKeyguardExternalViewCallbacks.aidl
 */
package cyanogenmod.externalviews;
/** @hide */
public interface IKeyguardExternalViewCallbacks extends android.os.IInterface
{
/** No-Op implementation  */
/** @hide */
public static class NoOp implements cyanogenmod.externalviews.IKeyguardExternalViewCallbacks
{
@Override public android.os.IBinder asBinder()
{
return null;
}
@Override public boolean requestDismiss() throws android.os.RemoteException
{
return false;
}
@Override public boolean requestDismissAndStartActivity(android.content.Intent intent) throws android.os.RemoteException
{
return false;
}
@Override public void collapseNotificationPanel() throws android.os.RemoteException
{
}
@Override public void setInteractivity(boolean isInteractive) throws android.os.RemoteException
{
}
@Override public void onAttachedToWindow() throws android.os.RemoteException
{
}
@Override public void onDetachedFromWindow() throws android.os.RemoteException
{
}
@Override public void slideLockscreenIn() throws android.os.RemoteException
{
}
}
/** Local-side IPC implementation stub class. */
public static abstract class Stub extends android.os.Binder implements cyanogenmod.externalviews.IKeyguardExternalViewCallbacks
{
private static final java.lang.String DESCRIPTOR = "cyanogenmod.externalviews.IKeyguardExternalViewCallbacks";
/** Construct the stub at attach it to the interface. */
public Stub()
{
this.attachInterface(this, DESCRIPTOR);
}
/**
 * Cast an IBinder object into an cyanogenmod.externalviews.IKeyguardExternalViewCallbacks interface,
 * generating a proxy if needed.
 */
public static cyanogenmod.externalviews.IKeyguardExternalViewCallbacks asInterface(android.os.IBinder obj)
{
if ((obj==null)) {
return null;
}
android.os.IInterface iin = obj.queryLocalInterface(DESCRIPTOR);
if (((iin!=null)&&(iin instanceof cyanogenmod.externalviews.IKeyguardExternalViewCallbacks))) {
return ((cyanogenmod.externalviews.IKeyguardExternalViewCallbacks)iin);
}
return new cyanogenmod.externalviews.IKeyguardExternalViewCallbacks.Stub.Proxy(obj);
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
case TRANSACTION_requestDismiss_0:
{
data.enforceInterface(DESCRIPTOR);
boolean _result = this.requestDismiss();
reply.writeNoException();
reply.writeInt(((_result)?(1):(0)));
return true;
}
case TRANSACTION_requestDismissAndStartActivity:
{
data.enforceInterface(DESCRIPTOR);
android.content.Intent _arg0;
if ((0!=data.readInt())) {
_arg0 = android.content.Intent.CREATOR.createFromParcel(data);
}
else {
_arg0 = null;
}
boolean _result = this.requestDismissAndStartActivity(_arg0);
reply.writeNoException();
reply.writeInt(((_result)?(1):(0)));
return true;
}
case TRANSACTION_collapseNotificationPanel:
{
data.enforceInterface(DESCRIPTOR);
this.collapseNotificationPanel();
return true;
}
case TRANSACTION_setInteractivity:
{
data.enforceInterface(DESCRIPTOR);
boolean _arg0;
_arg0 = (0!=data.readInt());
this.setInteractivity(_arg0);
return true;
}
case TRANSACTION_onAttachedToWindow:
{
data.enforceInterface(DESCRIPTOR);
this.onAttachedToWindow();
return true;
}
case TRANSACTION_onDetachedFromWindow:
{
data.enforceInterface(DESCRIPTOR);
this.onDetachedFromWindow();
return true;
}
case TRANSACTION_slideLockscreenIn:
{
data.enforceInterface(DESCRIPTOR);
this.slideLockscreenIn();
return true;
}
}
return super.onTransact(code, data, reply, flags);
}
private static class Proxy implements cyanogenmod.externalviews.IKeyguardExternalViewCallbacks
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
@Override public boolean requestDismiss() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
boolean _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_requestDismiss_0, _data, _reply, 0);
_reply.readException();
_result = (0!=_reply.readInt());
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public boolean requestDismissAndStartActivity(android.content.Intent intent) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
boolean _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
if ((intent!=null)) {
_data.writeInt(1);
intent.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
mRemote.transact(Stub.TRANSACTION_requestDismissAndStartActivity, _data, _reply, 0);
_reply.readException();
_result = (0!=_reply.readInt());
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public void collapseNotificationPanel() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_collapseNotificationPanel, _data, null, android.os.IBinder.FLAG_ONEWAY);
}
finally {
_data.recycle();
}
}
@Override public void setInteractivity(boolean isInteractive) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(((isInteractive)?(1):(0)));
mRemote.transact(Stub.TRANSACTION_setInteractivity, _data, null, android.os.IBinder.FLAG_ONEWAY);
}
finally {
_data.recycle();
}
}
@Override public void onAttachedToWindow() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_onAttachedToWindow, _data, null, android.os.IBinder.FLAG_ONEWAY);
}
finally {
_data.recycle();
}
}
@Override public void onDetachedFromWindow() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_onDetachedFromWindow, _data, null, android.os.IBinder.FLAG_ONEWAY);
}
finally {
_data.recycle();
}
}
@Override public void slideLockscreenIn() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_slideLockscreenIn, _data, null, android.os.IBinder.FLAG_ONEWAY);
}
finally {
_data.recycle();
}
}
}
static final int TRANSACTION_requestDismiss_0 = (android.os.IBinder.FIRST_CALL_TRANSACTION + 0);
static final int TRANSACTION_requestDismissAndStartActivity = (android.os.IBinder.FIRST_CALL_TRANSACTION + 1);
static final int TRANSACTION_collapseNotificationPanel = (android.os.IBinder.FIRST_CALL_TRANSACTION + 2);
static final int TRANSACTION_setInteractivity = (android.os.IBinder.FIRST_CALL_TRANSACTION + 3);
static final int TRANSACTION_onAttachedToWindow = (android.os.IBinder.FIRST_CALL_TRANSACTION + 4);
static final int TRANSACTION_onDetachedFromWindow = (android.os.IBinder.FIRST_CALL_TRANSACTION + 5);
static final int TRANSACTION_slideLockscreenIn = (android.os.IBinder.FIRST_CALL_TRANSACTION + 6);
}
public boolean requestDismiss() throws android.os.RemoteException;
public boolean requestDismissAndStartActivity(android.content.Intent intent) throws android.os.RemoteException;
public void collapseNotificationPanel() throws android.os.RemoteException;
public void setInteractivity(boolean isInteractive) throws android.os.RemoteException;
public void onAttachedToWindow() throws android.os.RemoteException;
public void onDetachedFromWindow() throws android.os.RemoteException;
public void slideLockscreenIn() throws android.os.RemoteException;
}
