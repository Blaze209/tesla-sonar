package com.tesla.oapi;

import ic0.i;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;
import vc0.f0;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0018\u001a\u0004\b\u0019\u0010\tR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u001a\u001a\u0004\b\u001b\u0010\u000bR\u0017\u0010\u001c\u001a\u00020\u00158\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001c\u0010\u001eR\u0017\u0010\u001f\u001a\u00020\u00158\u0006¢\u0006\f\n\u0004\b\u001f\u0010\u001d\u001a\u0004\b\u001f\u0010\u001eR\u0013\u0010#\u001a\u0004\u0018\u00010 8F¢\u0006\u0006\u001a\u0004\b!\u0010\"¨\u0006$"}, d2 = {"Lcom/tesla/oapi/DoorAndMoveType;", "", "Lcom/tesla/oapi/ClosureMoveRequestDoor;", "door", "Lvc0/f0;", "moveType", "<init>", "(Lcom/tesla/oapi/ClosureMoveRequestDoor;Lvc0/f0;)V", "component1", "()Lcom/tesla/oapi/ClosureMoveRequestDoor;", "component2", "()Lvc0/f0;", "copy", "(Lcom/tesla/oapi/ClosureMoveRequestDoor;Lvc0/f0;)Lcom/tesla/oapi/DoorAndMoveType;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/tesla/oapi/ClosureMoveRequestDoor;", "getDoor", "Lvc0/f0;", "getMoveType", "isOpenMove", "Z", "()Z", "isCloseMove", "Lic0/i;", "getGeneratedDoor", "()Lic0/i;", "generatedDoor", "oapi_globalPlayRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class DoorAndMoveType {
    private final ClosureMoveRequestDoor door;
    private final boolean isCloseMove;
    private final boolean isOpenMove;
    private final f0 moveType;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ClosureMoveRequestDoor.values().length];
            try {
                iArr[ClosureMoveRequestDoor.FRONT_DRIVER_DOOR.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ClosureMoveRequestDoor.FRONT_PASSENGER_DOOR.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ClosureMoveRequestDoor.REAR_DRIVER_DOOR.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[ClosureMoveRequestDoor.REAR_PASSENGER_DOOR.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public DoorAndMoveType(ClosureMoveRequestDoor door, f0 moveType) {
        s.k(door, "door");
        s.k(moveType, "moveType");
        this.door = door;
        this.moveType = moveType;
        this.isOpenMove = moveType == f0.CLOSURE_MOVE_TYPE_OPEN;
        this.isCloseMove = moveType == f0.CLOSURE_MOVE_TYPE_CLOSE;
    }

    public static /* synthetic */ DoorAndMoveType copy$default(DoorAndMoveType doorAndMoveType, ClosureMoveRequestDoor closureMoveRequestDoor, f0 f0Var, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            closureMoveRequestDoor = doorAndMoveType.door;
        }
        if ((i11 & 2) != 0) {
            f0Var = doorAndMoveType.moveType;
        }
        return doorAndMoveType.copy(closureMoveRequestDoor, f0Var);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final ClosureMoveRequestDoor getDoor() {
        return this.door;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final f0 getMoveType() {
        return this.moveType;
    }

    public final DoorAndMoveType copy(ClosureMoveRequestDoor door, f0 moveType) {
        s.k(door, "door");
        s.k(moveType, "moveType");
        return new DoorAndMoveType(door, moveType);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DoorAndMoveType)) {
            return false;
        }
        DoorAndMoveType doorAndMoveType = (DoorAndMoveType) other;
        return this.door == doorAndMoveType.door && this.moveType == doorAndMoveType.moveType;
    }

    public final ClosureMoveRequestDoor getDoor() {
        return this.door;
    }

    public final i getGeneratedDoor() {
        int i11 = WhenMappings.$EnumSwitchMapping$0[this.door.ordinal()];
        if (i11 == 1) {
            return i.DRIVER_FRONT_DOOR;
        }
        if (i11 == 2) {
            return i.PASSENGER_FRONT_DOOR;
        }
        if (i11 == 3) {
            return i.DRIVER_REAR_DOOR;
        }
        if (i11 != 4) {
            return null;
        }
        return i.PASSENGER_REAR_DOOR;
    }

    public final f0 getMoveType() {
        return this.moveType;
    }

    public int hashCode() {
        return (this.door.hashCode() * 31) + this.moveType.hashCode();
    }

    /* JADX INFO: renamed from: isCloseMove, reason: from getter */
    public final boolean getIsCloseMove() {
        return this.isCloseMove;
    }

    /* JADX INFO: renamed from: isOpenMove, reason: from getter */
    public final boolean getIsOpenMove() {
        return this.isOpenMove;
    }

    public String toString() {
        return "DoorAndMoveType(door=" + this.door + ", moveType=" + this.moveType + ")";
    }
}
