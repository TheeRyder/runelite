package com.openosrs.client;

import com.openosrs.client.game.NPCStats;

import java.io.File;
import java.util.UUID;

public class OpenOSRS
{
	public static final File OPENOSRS_DIR = new File(System.getProperty("user.home"), ".openosrs");
	public static final File EXTERNALPLUGIN_DIR = new File(OPENOSRS_DIR, "plugins");
	public static final String SYSTEM_VERSION = "0.0.1";

	public static String uuid = UUID.randomUUID().toString();

	public static void init()
	{
		try
		{
			NPCStats.loadStats();
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
	}
}