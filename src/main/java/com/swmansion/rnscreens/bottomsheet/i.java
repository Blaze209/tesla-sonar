package com.swmansion.rnscreens.bottomsheet;

import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u001d\u0010\u000b\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u0004¢\u0006\u0004\b\u000b\u0010\fJ\u001d\u0010\r\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u0004¢\u0006\u0004\b\r\u0010\fJ\u001d\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\u0004¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Lcom/swmansion/rnscreens/bottomsheet/i;", "", "<init>", "()V", "", "state", "", "isStateStable", "(I)Z", "index", "detentCount", "sheetStateFromDetentIndex", "(II)I", "detentIndexFromSheetState", "otherState", "isStateLessEqualThan", "(II)Z", "react-native-screens_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class i {
    public static final i INSTANCE = new i();

    private i() {
    }

    public final int detentIndexFromSheetState(int state, int detentCount) {
        if (detentCount == 1) {
            if (state == 3) {
                return 0;
            }
            if (state == 5) {
                return -1;
            }
            throw new IllegalArgumentException("[RNScreens] Invalid state " + state + " for detentCount " + detentCount);
        }
        if (detentCount == 2) {
            if (state == 3) {
                return 1;
            }
            if (state == 4) {
                return 0;
            }
            if (state == 5) {
                return -1;
            }
            throw new IllegalArgumentException("[RNScreens] Invalid state " + state + " for detentCount " + detentCount);
        }
        if (detentCount != 3) {
            throw new IllegalArgumentException("[RNScreens] Invalid state " + state + " for detentCount " + detentCount);
        }
        if (state == 3) {
            return 2;
        }
        if (state == 4) {
            return 0;
        }
        if (state == 5) {
            return -1;
        }
        if (state == 6) {
            return 1;
        }
        throw new IllegalArgumentException("[RNScreens] Invalid state " + state + " for detentCount " + detentCount);
    }

    public final boolean isStateLessEqualThan(int state, int otherState) {
        if (state == otherState) {
            return true;
        }
        if (state != 6 && otherState != 6) {
            return state > otherState;
        }
        if (state == 6) {
            return otherState == 3;
        }
        return state == 4 && otherState != 5;
    }

    public final boolean isStateStable(int state) {
        return state == 3 || state == 4 || state == 5 || state == 6;
    }

    public final int sheetStateFromDetentIndex(int index, int detentCount) {
        if (detentCount == 1) {
            if (index == -1) {
                return 5;
            }
            if (index == 0) {
                return 3;
            }
            throw new IllegalArgumentException("[RNScreens] Invalid detentCount/index combination " + detentCount + " / " + index);
        }
        if (detentCount == 2) {
            if (index == -1) {
                return 5;
            }
            if (index == 0) {
                return 4;
            }
            if (index == 1) {
                return 3;
            }
            throw new IllegalArgumentException("[RNScreens] Invalid detentCount/index combination " + detentCount + " / " + index);
        }
        if (detentCount != 3) {
            throw new IllegalArgumentException("[RNScreens] Invalid detentCount/index combination " + detentCount + " / " + index);
        }
        if (index == -1) {
            return 5;
        }
        if (index == 0) {
            return 4;
        }
        if (index == 1) {
            return 6;
        }
        if (index == 2) {
            return 3;
        }
        throw new IllegalArgumentException("[RNScreens] Invalid detentCount/index combination " + detentCount + " / " + index);
    }
}
