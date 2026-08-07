package com.facebook.react.fabric.mounting.mountitems;

import com.adyen.checkout.components.core.Address;
import com.facebook.react.bridge.ReactMarker;
import com.facebook.react.bridge.ReactMarkerConstants;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.fabric.FabricUIManager;
import com.facebook.react.fabric.events.EventEmitterWrapper;
import com.facebook.react.fabric.mounting.MountingManager;
import com.facebook.react.fabric.mounting.SurfaceMountingManager;
import com.facebook.react.uimanager.u0;
import in.a;
import tn.b;

/* JADX INFO: loaded from: classes3.dex */
@a
final class IntBufferBatchMountItem implements BatchMountItem {
    static final int INSTRUCTION_CREATE = 2;
    static final int INSTRUCTION_DELETE = 4;
    static final int INSTRUCTION_FLAG_MULTIPLE = 1;
    static final int INSTRUCTION_INSERT = 8;
    static final int INSTRUCTION_REMOVE = 16;
    static final int INSTRUCTION_UPDATE_EVENT_EMITTER = 256;
    static final int INSTRUCTION_UPDATE_LAYOUT = 128;
    static final int INSTRUCTION_UPDATE_OVERFLOW_INSET = 1024;
    static final int INSTRUCTION_UPDATE_PADDING = 512;
    static final int INSTRUCTION_UPDATE_PROPS = 32;
    static final int INSTRUCTION_UPDATE_STATE = 64;
    static final String TAG = "IntBufferBatchMountItem";
    private final int mCommitNumber;
    private final int[] mIntBuffer;
    private final int mIntBufferLen;
    private final Object[] mObjBuffer;
    private final int mObjBufferLen;
    private final int mSurfaceId;

    IntBufferBatchMountItem(int i11, int[] iArr, Object[] objArr, int i12) {
        this.mSurfaceId = i11;
        this.mCommitNumber = i12;
        this.mIntBuffer = iArr;
        this.mObjBuffer = objArr;
        this.mIntBufferLen = iArr.length;
        this.mObjBufferLen = objArr.length;
    }

    private void beginMarkers(String str) {
        ep.a.c(0L, "IntBufferBatchMountItem::" + str);
        int i11 = this.mCommitNumber;
        if (i11 > 0) {
            ReactMarker.logFabricMarker(ReactMarkerConstants.FABRIC_BATCH_EXECUTION_START, null, i11);
        }
    }

    private void endMarkers() {
        int i11 = this.mCommitNumber;
        if (i11 > 0) {
            ReactMarker.logFabricMarker(ReactMarkerConstants.FABRIC_BATCH_EXECUTION_END, null, i11);
        }
        ep.a.i(0L);
    }

    private static String nameForInstructionString(int i11) {
        if (i11 == 2) {
            return "CREATE";
        }
        if (i11 == 4) {
            return "DELETE";
        }
        if (i11 == 8) {
            return "INSERT";
        }
        if (i11 == 16) {
            return "REMOVE";
        }
        if (i11 == 32) {
            return "UPDATE_PROPS";
        }
        if (i11 == 64) {
            return "UPDATE_STATE";
        }
        if (i11 == 128) {
            return "UPDATE_LAYOUT";
        }
        if (i11 == 512) {
            return "UPDATE_PADDING";
        }
        if (i11 == 1024) {
            return "UPDATE_OVERFLOW_INSET";
        }
        return i11 == 256 ? "UPDATE_EVENT_EMITTER" : "UNKNOWN";
    }

    @Override // com.facebook.react.fabric.mounting.mountitems.MountItem
    public void execute(MountingManager mountingManager) {
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        SurfaceMountingManager surfaceManager = mountingManager.getSurfaceManager(this.mSurfaceId);
        if (surfaceManager == null) {
            qk.a.o(TAG, "Skipping batch of MountItems; no SurfaceMountingManager found for [%d].", Integer.valueOf(this.mSurfaceId));
            return;
        }
        if (surfaceManager.isStopped()) {
            qk.a.o(TAG, "Skipping batch of MountItems; was stopped [%d].", Integer.valueOf(this.mSurfaceId));
            return;
        }
        if (b.e()) {
            qk.a.c(TAG, "Executing IntBufferBatchMountItem on surface [%d]", Integer.valueOf(this.mSurfaceId));
        }
        beginMarkers("mountViews");
        int i17 = 0;
        int i18 = 0;
        while (i17 < this.mIntBufferLen) {
            int[] iArr = this.mIntBuffer;
            int i19 = i17 + 1;
            int i21 = iArr[i17];
            int i22 = i21 & (-2);
            if ((i21 & 1) != 0) {
                int i23 = iArr[i19];
                i19 = i17 + 2;
                i11 = i23;
            } else {
                i11 = 1;
            }
            int i24 = 2;
            ep.a.d(0L, "IntBufferBatchMountItem::mountInstructions::" + nameForInstructionString(i22), new String[]{"numInstructions", String.valueOf(i11)}, 2);
            int i25 = i18;
            i17 = i19;
            int i26 = 0;
            while (i26 < i11) {
                if (i22 == i24) {
                    String fabricComponentName = FabricNameComponentMapping.getFabricComponentName((String) this.mObjBuffer[i25]);
                    int[] iArr2 = this.mIntBuffer;
                    int i27 = i17;
                    int i28 = iArr2[i27];
                    Object[] objArr = this.mObjBuffer;
                    ReadableMap readableMap = (ReadableMap) objArr[i25 + 1];
                    int i29 = i25 + 3;
                    u0 u0Var = (u0) objArr[i25 + 2];
                    i25 += 4;
                    EventEmitterWrapper eventEmitterWrapper = (EventEmitterWrapper) objArr[i29];
                    int i31 = i27 + 2;
                    surfaceManager.createView(fabricComponentName, i28, readableMap, u0Var, eventEmitterWrapper, iArr2[i17 + 1] == 1);
                    i12 = i24;
                    i13 = i26;
                    i17 = i31;
                } else {
                    int i32 = i17;
                    if (i22 == 4) {
                        i17 = i32 + 1;
                        surfaceManager.deleteView(this.mIntBuffer[i32]);
                    } else {
                        if (i22 == 8) {
                            int[] iArr3 = this.mIntBuffer;
                            i16 = i32 + 3;
                            surfaceManager.addViewAt(iArr3[i32 + 1], iArr3[i32], iArr3[i32 + 2]);
                        } else if (i22 == 16) {
                            int[] iArr4 = this.mIntBuffer;
                            i16 = i32 + 3;
                            surfaceManager.removeViewAt(iArr4[i32], iArr4[i32 + 1], iArr4[i32 + 2]);
                        } else {
                            if (i22 == 32) {
                                i17 = i32 + 1;
                                i15 = i25 + 1;
                                surfaceManager.updateProps(this.mIntBuffer[i32], (ReadableMap) this.mObjBuffer[i25]);
                            } else if (i22 == 64) {
                                i17 = i32 + 1;
                                i15 = i25 + 1;
                                surfaceManager.updateState(this.mIntBuffer[i32], (u0) this.mObjBuffer[i25]);
                            } else if (i22 == 128) {
                                int[] iArr5 = this.mIntBuffer;
                                int i33 = iArr5[i32];
                                int i34 = iArr5[i32 + 1];
                                int i35 = iArr5[i32 + 2];
                                int i36 = iArr5[i32 + 3];
                                int i37 = iArr5[i32 + 4];
                                int i38 = iArr5[i32 + 5];
                                int i39 = iArr5[i32 + 6];
                                int i41 = iArr5[i32 + 7];
                                i13 = i26;
                                i12 = i24;
                                surfaceManager.updateLayout(i33, i34, i35, i36, i37, i38, i39, i41);
                                i17 = i32 + 8;
                            } else {
                                i12 = i24;
                                i13 = i26;
                                if (i22 == 512) {
                                    int[] iArr6 = this.mIntBuffer;
                                    int i42 = iArr6[i32];
                                    int i43 = iArr6[i32 + 1];
                                    int i44 = iArr6[i32 + 2];
                                    int i45 = i32 + 4;
                                    int i46 = iArr6[i32 + 3];
                                    i14 = i32 + 5;
                                    surfaceManager.updatePadding(i42, i43, i44, i46, iArr6[i45]);
                                } else if (i22 == 1024) {
                                    int[] iArr7 = this.mIntBuffer;
                                    int i47 = iArr7[i32];
                                    int i48 = iArr7[i32 + 1];
                                    int i49 = iArr7[i32 + 2];
                                    int i51 = i32 + 4;
                                    int i52 = iArr7[i32 + 3];
                                    i14 = i32 + 5;
                                    surfaceManager.updateOverflowInset(i47, i48, i49, i52, iArr7[i51]);
                                } else {
                                    if (i22 != 256) {
                                        throw new IllegalArgumentException("Invalid type argument to IntBufferBatchMountItem: " + i22 + " at index: " + i32);
                                    }
                                    surfaceManager.updateEventEmitter(this.mIntBuffer[i32], (EventEmitterWrapper) this.mObjBuffer[i25]);
                                    i17 = i32 + 1;
                                    i25++;
                                }
                                i17 = i14;
                            }
                            i25 = i15;
                        }
                        i17 = i16;
                    }
                    i12 = i24;
                    i13 = i26;
                }
                i26 = i13 + 1;
                i24 = i12;
            }
            ep.a.i(0L);
            i18 = i25;
        }
        endMarkers();
    }

    @Override // com.facebook.react.fabric.mounting.mountitems.MountItem
    public int getSurfaceId() {
        return this.mSurfaceId;
    }

    @Override // com.facebook.react.fabric.mounting.mountitems.BatchMountItem
    public boolean isBatchEmpty() {
        return this.mIntBufferLen == 0;
    }

    public String toString() {
        int i11;
        int i12;
        try {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(String.format("IntBufferBatchMountItem [surface:%d]:\n", Integer.valueOf(this.mSurfaceId)));
            int i13 = 0;
            int i14 = 0;
            while (i13 < this.mIntBufferLen) {
                int[] iArr = this.mIntBuffer;
                int i15 = i13 + 1;
                int i16 = iArr[i13];
                int i17 = i16 & (-2);
                int i18 = 1;
                if ((i16 & 1) != 0) {
                    i18 = iArr[i15];
                    i15 = i13 + 2;
                }
                i13 = i15;
                for (int i19 = 0; i19 < i18; i19++) {
                    if (i17 == 2) {
                        String fabricComponentName = FabricNameComponentMapping.getFabricComponentName((String) this.mObjBuffer[i14]);
                        i14 += 4;
                        int i21 = i13 + 1;
                        Integer numValueOf = Integer.valueOf(this.mIntBuffer[i13]);
                        i13 += 2;
                        sb2.append(String.format("CREATE [%d] - layoutable:%d - %s\n", numValueOf, Integer.valueOf(this.mIntBuffer[i21]), fabricComponentName));
                    } else if (i17 == 4) {
                        sb2.append(String.format("DELETE [%d]\n", Integer.valueOf(this.mIntBuffer[i13])));
                        i13++;
                    } else if (i17 == 8) {
                        Integer numValueOf2 = Integer.valueOf(this.mIntBuffer[i13]);
                        int i22 = i13 + 2;
                        Integer numValueOf3 = Integer.valueOf(this.mIntBuffer[i13 + 1]);
                        i13 += 3;
                        sb2.append(String.format("INSERT [%d]->[%d] @%d\n", numValueOf2, numValueOf3, Integer.valueOf(this.mIntBuffer[i22])));
                    } else if (i17 == 16) {
                        Integer numValueOf4 = Integer.valueOf(this.mIntBuffer[i13]);
                        int i23 = i13 + 2;
                        Integer numValueOf5 = Integer.valueOf(this.mIntBuffer[i13 + 1]);
                        i13 += 3;
                        sb2.append(String.format("REMOVE [%d]->[%d] @%d\n", numValueOf4, numValueOf5, Integer.valueOf(this.mIntBuffer[i23])));
                    } else {
                        if (i17 == 32) {
                            i11 = i14 + 1;
                            Object obj = this.mObjBuffer[i14];
                            i12 = i13 + 1;
                            sb2.append(String.format("UPDATE PROPS [%d]: %s\n", Integer.valueOf(this.mIntBuffer[i13]), FabricUIManager.IS_DEVELOPMENT_ENVIRONMENT ? obj != null ? obj.toString() : "<null>" : "<hidden>"));
                        } else if (i17 == 64) {
                            i11 = i14 + 1;
                            u0 u0Var = (u0) this.mObjBuffer[i14];
                            i12 = i13 + 1;
                            sb2.append(String.format("UPDATE STATE [%d]: %s\n", Integer.valueOf(this.mIntBuffer[i13]), FabricUIManager.IS_DEVELOPMENT_ENVIRONMENT ? u0Var != null ? u0Var.toString() : "<null>" : "<hidden>"));
                        } else if (i17 == 128) {
                            int[] iArr2 = this.mIntBuffer;
                            int i24 = iArr2[i13];
                            int i25 = iArr2[i13 + 1];
                            int i26 = iArr2[i13 + 2];
                            int i27 = iArr2[i13 + 3];
                            int i28 = iArr2[i13 + 4];
                            int i29 = iArr2[i13 + 5];
                            int i31 = i13 + 7;
                            int i32 = iArr2[i13 + 6];
                            i13 += 8;
                            sb2.append(String.format("UPDATE LAYOUT [%d]->[%d]: x:%d y:%d w:%d h:%d displayType:%d layoutDirection: %d\n", Integer.valueOf(i25), Integer.valueOf(i24), Integer.valueOf(i26), Integer.valueOf(i27), Integer.valueOf(i28), Integer.valueOf(i29), Integer.valueOf(i32), Integer.valueOf(iArr2[i31])));
                        } else if (i17 == 512) {
                            Integer numValueOf6 = Integer.valueOf(this.mIntBuffer[i13]);
                            Integer numValueOf7 = Integer.valueOf(this.mIntBuffer[i13 + 1]);
                            Integer numValueOf8 = Integer.valueOf(this.mIntBuffer[i13 + 2]);
                            int i33 = i13 + 4;
                            Integer numValueOf9 = Integer.valueOf(this.mIntBuffer[i13 + 3]);
                            i13 += 5;
                            sb2.append(String.format("UPDATE PADDING [%d]: top:%d right:%d bottom:%d left:%d\n", numValueOf6, numValueOf7, numValueOf8, numValueOf9, Integer.valueOf(this.mIntBuffer[i33])));
                        } else if (i17 == 1024) {
                            Integer numValueOf10 = Integer.valueOf(this.mIntBuffer[i13]);
                            Integer numValueOf11 = Integer.valueOf(this.mIntBuffer[i13 + 1]);
                            Integer numValueOf12 = Integer.valueOf(this.mIntBuffer[i13 + 2]);
                            int i34 = i13 + 4;
                            Integer numValueOf13 = Integer.valueOf(this.mIntBuffer[i13 + 3]);
                            i13 += 5;
                            sb2.append(String.format("UPDATE OVERFLOWINSET [%d]: left:%d top:%d right:%d bottom:%d\n", numValueOf10, numValueOf11, numValueOf12, numValueOf13, Integer.valueOf(this.mIntBuffer[i34])));
                        } else {
                            if (i17 != 256) {
                                qk.a.m(TAG, "String so far: " + sb2.toString());
                                throw new IllegalArgumentException("Invalid type argument to IntBufferBatchMountItem: " + i17 + " at index: " + i13);
                            }
                            i14++;
                            sb2.append(String.format("UPDATE EVENTEMITTER [%d]\n", Integer.valueOf(this.mIntBuffer[i13])));
                            i13++;
                        }
                        i13 = i12;
                        i14 = i11;
                    }
                }
            }
            return sb2.toString();
        } catch (Exception e11) {
            qk.a.n(TAG, "Caught exception trying to print", e11);
            StringBuilder sb3 = new StringBuilder();
            for (int i35 = 0; i35 < this.mIntBufferLen; i35++) {
                sb3.append(this.mIntBuffer[i35]);
                sb3.append(", ");
            }
            qk.a.m(TAG, sb3.toString());
            for (int i36 = 0; i36 < this.mObjBufferLen; i36++) {
                String str = TAG;
                Object obj2 = this.mObjBuffer[i36];
                qk.a.m(str, obj2 != null ? obj2.toString() : Address.ADDRESS_NULL_PLACEHOLDER);
            }
            return "";
        }
    }
}
