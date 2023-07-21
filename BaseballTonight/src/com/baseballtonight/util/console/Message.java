package com.baseballtonight.util.console;

public class Message {
	public static String app_starting_msg = ""
		+ Coloring.getCyan("______                    _             _  _          _____                _         _      _   \n")
		+ Coloring.getCyan("| ___ \\                  | |           | || |        |_   _|              (_)       | |    | |  \n")
		+ Coloring.getCyan("| |_/ /  __ _  ___   ___ | |__    __ _ | || |  ____    | |    ___   _ __   _   __ _ | |__  | |_ \n")
		+ Coloring.getCyan("| ___ \\ / _` |/ __| / _ \\| '_ \\  / _` || || | |____|   | |   / _ \\ | '_ \\ | | / _` || '_ \\ | __|\n")
		+ Coloring.getCyan("| |_/ /| (_| |\\__ \\|  __/| |_) || (_| || || |          | |  | (_) || | | || || (_| || | | || |_ \n")
		+ Coloring.getBlue("\\____/  \\__,_||___/ \\___||_.__/  \\__,_||_||_|          \\_/   \\___/ |_| |_||_| \\__, ||_| |_| \\__|\n")
		+ Coloring.getBlue("                                                                               __/ |            \n")
		+ Coloring.getBlue("                                                                              |___/             \n");
	
	public static String main_cmd_ls = 
		  Coloring.getBlue("	<MAIN - MENU>\n")
		+"-------------------------------\n"
		+ Coloring.getCyan("경기 예매하기:	reserve \n")
		+"-------------------------------\n"
		+ Coloring.getCyan("예매내역 조회:	myreserve \n")
		+"-------------------------------\n"
		+ Coloring.getCyan("경기장 정보:	stadium \n")
		+"-------------------------------\n"
		+ Coloring.getCyan("좌석 정보:		seats \n")
		+"-------------------------------\n"
		+ Coloring.getCyan("회원정보:		self \n")
		+"-------------------------------\n"
		+ Coloring.getCyan("로그아웃:		logout \n")
		+"-------------------------------\n"
		+ Coloring.getCyan("애플리케이션 종료:	exit \n")
		+"-------------------------------";
	
	public static String stadium_info_cmd_ls = ""
		+ Coloring.getCyan("식음료 정보:	eat\n")
		+"-------------------------------\n"
		+ Coloring.getCyan("경기장 찾기-버스:	bus\n")
		+"-------------------------------\n"
		+ Coloring.getCyan("경기장 찾기-지하철:	subway\n")
		+"-------------------------------\n"
		+ Coloring.getCyan("주차장:		parking\n")
		+"-------------------------------\n"
		+ Coloring.getCyan("구단 게시판:	board\n")
		+"-------------------------------\n"
		+ Coloring.getCyan("다른 경기장 조회:	other\n")
		+"-------------------------------\n"
		+ Coloring.getCyan("메인 메뉴:		main\n")
		+"-------------------------------\n";

	public static void showMemberCommands() {
		System.out.println("\n\n" + main_cmd_ls);
		System.out.print("\n>>> ");
	}
}