package com.learn.prototype.deepclone;

public class Client {
	public static void main(String[] args) throws CloneNotSupportedException {
		DeepCloneableTarget deepCloneableTarget = new DeepCloneableTarget("deppTarget");
		DeepProtoType deepProtoType = new DeepProtoType("protoType", deepCloneableTarget);
		// DeepProtoType clone = deepProtoType.clone();
		DeepProtoType clone = deepProtoType.deepClone();
		System.out.println(deepProtoType.name + " " + deepProtoType.deepCloneableTarget.hashCode());
		System.out.println(deepProtoType.name + " " + clone.deepCloneableTarget.hashCode());
	}
}
