package com.roytuts.spring.boot.logback.siftingappender.config;

import java.io.File;
import java.util.concurrent.atomic.AtomicBoolean;

import ch.qos.logback.core.rolling.TriggeringPolicyBase;

public class StartupTrigger<E> extends TriggeringPolicyBase<E> {

	private AtomicBoolean doRolling = new AtomicBoolean(true);

	@Override
	public boolean isTriggeringEvent(File activeFile, E event) {
		return doRolling.getAndSet(false);
	}

}
