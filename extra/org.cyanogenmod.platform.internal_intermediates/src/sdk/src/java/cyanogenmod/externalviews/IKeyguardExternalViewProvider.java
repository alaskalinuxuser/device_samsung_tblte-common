/*
 * This file is auto-generated.  DO NOT MODIFY.
 * Original file: vendor/cmsdk/sdk/src/java/cyanogenmod/externalviews/IKeyguardExternalViewProvider.aidl
 */
package cyanogenmod.externalviews;
/** @hide */
public interface IKeyguardExternalViewProvider extends android.os.IInterface
{
/** No-Op implementation  */
/** @hide */
public static class NoOp implements cyanogenmod.externalviews.IKeyguardExternalViewProvider
{
@Override public android.os.IBinder asBinder()
{
return null;
}
@Override public void onAttach(android.os.IBinder windowToken) throws android.os.RemoteException
{
}
@Override public void onDetach() throws android.os.RemoteException
{
}
// Keyguard specific interface

@Override public void onKeyguardShowing(boolean screenOn) throws android.os.RemoteException
{
}
@Override public void onKeyguardDismissed() throws android.os.RemoteException
{
}
@Override public void onBouncerShowing(boolean showing) throws android.os.RemoteException
{
}
@Override public void onScreenTurnedOn() throws android.os.RemoteException
{
}
@Override public void onScreenTurnedOff() throws android.os.RemoteException
{
}
@Override public void registerCallback(cyanogenmod.externalviews.IKeyguardExternalViewCallbacks callback) throws android.os.RemoteException
{
}
@Override public void unregisterCallback(cyanogenmod.externalviews.IKeyguardExternalViewCallbacks callback) throws android.os.RemoteException
{
}
@Override public void alterWindow(int x, int y, int width, int height, boolean visible, android.graphics.Rect clipRect) throws android.os.RemoteException
{
}
@Override public void onLockscreenSlideOffsetChanged(float swipeProgress) throws android.os.RemoteException
{
}
}
/** Local-side IPC implementation stub class. */
public static abstract class Stub extends android.os.Binder implements cyanogenmod.externalviews.IKeyguardExternalViewProvider
{
private static final java.lang.String DESCRIPTOR = "cyanogenmod.externalviews.IKeyguardExternalViewProvider";
/** Construct the stub at attach it to the interface. */
public Stub()
{
this.attachInterface(this, DESCRIPTOR);
}
/**
 * Cast an IBinder object into an cyanogenmod.externalviews.IKeyguardExternalViewProvider interface,
 * generating a proxy if needed.
 */
public static cyanogenmod.externalviews.IKeyguardExternalViewProvider asInterface(android.os.IBinder obj)
{
if ((obj==null)) {
return null;
}
android.os.IInterface iin = obj.queryLocalInterface(DESCRIPTOR);
if (((iin!=null)&&(iin instanceof cyanogenmod.externalviews.IKeyguardExternalViewProvider))) {
return ((cyanogenmod.externalviews.IKeyguardExternalViewProvider)iin);
}
return new cyanogenmod.externalviews.IKeyguardExternalViewProvider.Stub.Proxy(obj);
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
case TRANSACTION_onAttach:
{
data.enforceInterface(DESCRIPTOR);
android.os.IBinder _arg0;
_arg0 = data.readStrongBinder();
this.onAttach(_arg0);
return true;
}
case TRANSACTION_onDetach:
{
data.enforceInterface(DESCRIPTOR);
this.onDetach();
return true;
}
case TRANSACTION_onKeyguardShowing:
{
data.enforceInterface(DESCRIPTOR);
boolean _arg0;
_arg0 = (0!=data.readInt());
this.onKeyguardShowing(_arg0);
return true;
}
case TRANSACTION_onKeyguardDismissed:
{
data.enforceInterface(DESCRIPTOR);
this.onKeyguardDismissed();
return true;
}
case TRANSACTION_onBouncerShowing:
{
data.enforceInterface(DESCRIPTOR);
boolean _arg0;
_arg0 = (0!=data.readInt());
this.onBouncerShowing(_arg0);
return true;
}
case TRANSACTION_onScreenTurnedOn:
{
data.enforceInterface(DESCRIPTOR);
this.onScreenTurnedOn();
return true;
}
case TRANSACTION_onScreenTurnedOff:
{
data.enforceInterface(DESCRIPTOR);
this.onScreenTurnedOff();
return true;
}
case TRANSACTION_registerCallback:
{
data.enforceInterface(DESCRIPTOR);
cyanogenmod.externalviews.IKeyguardExternalViewCallbacks _arg0;
_arg0 = cyanogenmod.externalviews.IKeyguardExternalViewCallbacks.Stub.asInterface(data.readStrongBinder());
this.registerCallback(_arg0);
return true;
}
case TRANSACTION_unregisterCallback:
{
data.enforceInterface(DESCRIPTOR);
cyanogenmod.externalviews.IKeyguardExternalViewCallbacks _arg0;
_arg0 = cyanogenmod.externalviews.IKeyguardExternalViewCallbacks.Stub.asInterface(data.readStrongBinder());
this.unregisterCallback(_arg0);
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
case TRANSACTION_onLockscreenSlideOffsetChanged:
{
data.enforceInterface(DESCRIPTOR);
float _arg0;
_arg0 = data.readFloat();
this.onLockscreenSlideOffsetChanged(_arg0);
return true;
}
}
return super.onTransact(code, data, reply, flags);
}
private static class Proxy implements cyanogenmod.externalviews.IKeyguardExternalViewProvider
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
mRemote.transact(Stub.TRANSACTION_onAttach, _data, null, android.os.IBinder.FLAG_ONEWAY);
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
// Keyguard specific interface

@Override public void onKeyguardShowing(boolean screenOn) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(((screenOn)?(1):(0)));
mRemote.transact(Stub.TRANSACTION_onKeyguardShowing, _data, null, android.os.IBinder.FLAG_ONEWAY);
}
finally {
_data.recycle();
}
}
@Override public void onKeyguardDismissed() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_onKeyguardDismissed, _data, null, android.os.IBinder.FLAG_ONEWAY);
}
finally {
_data.recycle();
}
}
@Override public void onBouncerShowing(boolean showing) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(((showing)?(1):(0)));
mRemote.transact(Stub.TRANSACTION_onBouncerShowing, _data, null, android.os.IBinder.FLAG_ONEWAY);
}
finally {
_data.recycle();
}
}
@Override public void onScreenTurnedOn() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_onScreenTurnedOn, _data, null, android.os.IBinder.FLAG_ONEWAY);
}
finally {
_data.recycle();
}
}
@Override public void onScreenTurnedOff() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_onScreenTurnedOff, _data, null, android.os.IBinder.FLAG_ONEWAY);
}
finally {
_data.recycle();
}
}
@Override public void registerCallback(cyanogenmod.externalviews.IKeyguardExternalViewCallbacks callback) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeStrongBinder((((callback!=null))?(callback.asBinder()):(null)));
mRemote.transact(Stub.TRANSACTION_registerCallback, _data, null, android.os.IBinder.FLAG_ONEWAY);
}
finally {
_data.recycle();
}
}
@Override public void unregisterCallback(cyanogenmod.externalviews.IKeyguardExternalViewCallbacks callback) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeStrongBinder((((callback!=null))?(callback.asBinder()):(null)));
mRemote.transact(Stub.TRANSACTION_unregisterCallback, _data, null, android.os.IBinder.FLAG_ONEWAY);
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
@Override public void onLockscreenSlideOffsetChanged(float swipeProgress) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeFloat(swipeProgress);
mRemote.transact(Stub.TRANSACTION_onLockscreenSlideOffsetChanged, _data, null, android.os.IBinder.FLAG_ONEWAY);
}
finally {
_data.recycle();
}
}
}
static final int TRANSACTION_onAttach = (android.os.IBinder.FIRST_CALL_TRANSACTION + 0);
static final int TRANSACTION_onDetach = (android.os.IBinder.FIRST_CALL_TRANSACTION + 1);
static final int TRANSACTION_onKeyguardShowing = (android.os.IBinder.FIRST_CALL_TRANSACTION + 2);
static final int TRANSACTION_onKeyguardDismissed = (android.os.IBinder.FIRST_CALL_TRANSACTION + 3);
static final int TRANSACTION_onBouncerShowing = (android.os.IBinder.FIRST_CALL_TRANSACTION + 4);
static final int TRANSACTION_onScreenTurnedOn = (android.os.IBinder.FIRST_CALL_TRANSACTION + 5);
static final int TRANSACTION_onScreenTurnedOff = (android.os.IBinder.FIRST_CALL_TRANSACTION + 6);
static final int TRANSACTION_registerCallback = (android.os.IBinder.FIRST_CALL_TRANSACTION + 7);
static final int TRANSACTION_unregisterCallback = (android.os.IBinder.FIRST_CALL_TRANSACTION + 8);
static final int TRANSACTION_alterWindow = (android.os.IBinder.FIRST_CALL_TRANSACTION + 9);
static final int TRANSACTION_onLockscreenSlideOffsetChanged = (android.os.IBinder.FIRST_CALL_TRANSACTION + 10);
}
public void onAttach(android.os.IBinder windowToken) throws android.os.RemoteException;
public void onDetach() throws android.os.RemoteException;
// Keyguard specific interface

public void onKeyguardShowing(boolean screenOn) throws android.os.RemoteException;
public void onKeyguardDismissed() throws android.os.RemoteException;
public void onBouncerShowing(boolean showing) throws android.os.RemoteException;
public void onScreenTurnedOn() throws android.os.RemoteException;
public void onScreenTurnedOff() throws android.os.RemoteException;
public void registerCallback(cyanogenmod.externalviews.IKeyguardExternalViewCallbacks callback) throws android.os.RemoteException;
public void unregisterCallback(cyanogenmod.externalviews.IKeyguardExternalViewCallbacks callback) throws android.os.RemoteException;
public void alterWindow(int x, int y, int width, int height, boolean visible, android.graphics.Rect clipRect) throws android.os.RemoteException;
public void onLockscreenSlideOffsetChanged(float swipeProgress) throws android.os.RemoteException;
}
