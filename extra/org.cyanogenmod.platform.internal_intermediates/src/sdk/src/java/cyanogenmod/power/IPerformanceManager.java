/*
 * This file is auto-generated.  DO NOT MODIFY.
 * Original file: vendor/cmsdk/sdk/src/java/cyanogenmod/power/IPerformanceManager.aidl
 */
package cyanogenmod.power;
/** @hide */
public interface IPerformanceManager extends android.os.IInterface
{
/** No-Op implementation  */
/** @hide */
public static class NoOp implements cyanogenmod.power.IPerformanceManager
{
@Override public android.os.IBinder asBinder()
{
return null;
}
@Override public void cpuBoost(int duration) throws android.os.RemoteException
{
}
@Override public boolean setPowerProfile(int profile) throws android.os.RemoteException
{
return false;
}
@Override public int getPowerProfile() throws android.os.RemoteException
{
return 0;
}
@Override public int getNumberOfProfiles() throws android.os.RemoteException
{
return 0;
}
@Override public cyanogenmod.power.PerformanceProfile[] getPowerProfiles() throws android.os.RemoteException
{
return null;
}
@Override public cyanogenmod.power.PerformanceProfile getPowerProfileById(int profile) throws android.os.RemoteException
{
return null;
}
@Override public cyanogenmod.power.PerformanceProfile getActivePowerProfile() throws android.os.RemoteException
{
return null;
}
}
/** Local-side IPC implementation stub class. */
public static abstract class Stub extends android.os.Binder implements cyanogenmod.power.IPerformanceManager
{
private static final java.lang.String DESCRIPTOR = "cyanogenmod.power.IPerformanceManager";
/** Construct the stub at attach it to the interface. */
public Stub()
{
this.attachInterface(this, DESCRIPTOR);
}
/**
 * Cast an IBinder object into an cyanogenmod.power.IPerformanceManager interface,
 * generating a proxy if needed.
 */
public static cyanogenmod.power.IPerformanceManager asInterface(android.os.IBinder obj)
{
if ((obj==null)) {
return null;
}
android.os.IInterface iin = obj.queryLocalInterface(DESCRIPTOR);
if (((iin!=null)&&(iin instanceof cyanogenmod.power.IPerformanceManager))) {
return ((cyanogenmod.power.IPerformanceManager)iin);
}
return new cyanogenmod.power.IPerformanceManager.Stub.Proxy(obj);
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
case TRANSACTION_cpuBoost:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
this.cpuBoost(_arg0);
return true;
}
case TRANSACTION_setPowerProfile:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
boolean _result = this.setPowerProfile(_arg0);
reply.writeNoException();
reply.writeInt(((_result)?(1):(0)));
return true;
}
case TRANSACTION_getPowerProfile:
{
data.enforceInterface(DESCRIPTOR);
int _result = this.getPowerProfile();
reply.writeNoException();
reply.writeInt(_result);
return true;
}
case TRANSACTION_getNumberOfProfiles:
{
data.enforceInterface(DESCRIPTOR);
int _result = this.getNumberOfProfiles();
reply.writeNoException();
reply.writeInt(_result);
return true;
}
case TRANSACTION_getPowerProfiles:
{
data.enforceInterface(DESCRIPTOR);
cyanogenmod.power.PerformanceProfile[] _result = this.getPowerProfiles();
reply.writeNoException();
reply.writeTypedArray(_result, android.os.Parcelable.PARCELABLE_WRITE_RETURN_VALUE);
return true;
}
case TRANSACTION_getPowerProfileById:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
cyanogenmod.power.PerformanceProfile _result = this.getPowerProfileById(_arg0);
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
case TRANSACTION_getActivePowerProfile:
{
data.enforceInterface(DESCRIPTOR);
cyanogenmod.power.PerformanceProfile _result = this.getActivePowerProfile();
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
}
return super.onTransact(code, data, reply, flags);
}
private static class Proxy implements cyanogenmod.power.IPerformanceManager
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
@Override public void cpuBoost(int duration) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(duration);
mRemote.transact(Stub.TRANSACTION_cpuBoost, _data, null, android.os.IBinder.FLAG_ONEWAY);
}
finally {
_data.recycle();
}
}
@Override public boolean setPowerProfile(int profile) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
boolean _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(profile);
mRemote.transact(Stub.TRANSACTION_setPowerProfile, _data, _reply, 0);
_reply.readException();
_result = (0!=_reply.readInt());
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public int getPowerProfile() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
int _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_getPowerProfile, _data, _reply, 0);
_reply.readException();
_result = _reply.readInt();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public int getNumberOfProfiles() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
int _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_getNumberOfProfiles, _data, _reply, 0);
_reply.readException();
_result = _reply.readInt();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public cyanogenmod.power.PerformanceProfile[] getPowerProfiles() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
cyanogenmod.power.PerformanceProfile[] _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_getPowerProfiles, _data, _reply, 0);
_reply.readException();
_result = _reply.createTypedArray(cyanogenmod.power.PerformanceProfile.CREATOR);
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public cyanogenmod.power.PerformanceProfile getPowerProfileById(int profile) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
cyanogenmod.power.PerformanceProfile _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(profile);
mRemote.transact(Stub.TRANSACTION_getPowerProfileById, _data, _reply, 0);
_reply.readException();
if ((0!=_reply.readInt())) {
_result = cyanogenmod.power.PerformanceProfile.CREATOR.createFromParcel(_reply);
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
@Override public cyanogenmod.power.PerformanceProfile getActivePowerProfile() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
cyanogenmod.power.PerformanceProfile _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_getActivePowerProfile, _data, _reply, 0);
_reply.readException();
if ((0!=_reply.readInt())) {
_result = cyanogenmod.power.PerformanceProfile.CREATOR.createFromParcel(_reply);
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
}
static final int TRANSACTION_cpuBoost = (android.os.IBinder.FIRST_CALL_TRANSACTION + 0);
static final int TRANSACTION_setPowerProfile = (android.os.IBinder.FIRST_CALL_TRANSACTION + 1);
static final int TRANSACTION_getPowerProfile = (android.os.IBinder.FIRST_CALL_TRANSACTION + 2);
static final int TRANSACTION_getNumberOfProfiles = (android.os.IBinder.FIRST_CALL_TRANSACTION + 3);
static final int TRANSACTION_getPowerProfiles = (android.os.IBinder.FIRST_CALL_TRANSACTION + 4);
static final int TRANSACTION_getPowerProfileById = (android.os.IBinder.FIRST_CALL_TRANSACTION + 5);
static final int TRANSACTION_getActivePowerProfile = (android.os.IBinder.FIRST_CALL_TRANSACTION + 6);
}
public void cpuBoost(int duration) throws android.os.RemoteException;
public boolean setPowerProfile(int profile) throws android.os.RemoteException;
public int getPowerProfile() throws android.os.RemoteException;
public int getNumberOfProfiles() throws android.os.RemoteException;
public cyanogenmod.power.PerformanceProfile[] getPowerProfiles() throws android.os.RemoteException;
public cyanogenmod.power.PerformanceProfile getPowerProfileById(int profile) throws android.os.RemoteException;
public cyanogenmod.power.PerformanceProfile getActivePowerProfile() throws android.os.RemoteException;
}
