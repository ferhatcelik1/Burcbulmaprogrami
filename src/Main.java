import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int ay, gun;
        String burc = "";
        boolean isError = false;

        Scanner inp = new Scanner(System.in);
        System.out.println(" doğduğun ay :");
        ay = inp.nextInt();

        System.out.println("doğduğun gün :");
        gun = inp.nextInt();

        switch (ay) {
            
            case 1:
                if (gun >= 1 && gun <= 31) {
                    if (gun < 22) {
                        burc = "oğlak";
                    } else {
                        burc = "kova";

                    }
                } else {
                    isError = true;

                }
                break;
            case 2:
                if (gun >= 1 && gun <= 28) {
                    if (gun < 20) {
                        burc = "kova";
                    } else {
                        burc = "balık";
                    }

                } else {
                    isError = true;
                }
                break;
            case 3:
                if (gun >= 1 && gun <= 31) {
                    if (gun < 21) {
                        burc = "balık";
                    } else {
                        burc = "koç";
                    }

                } else {
                    isError = true;
                }
                break;
            case 4:
                if (gun >= 1 && gun <= 30) {
                    if (gun < 21) {
                        burc = "koç";
                    } else {
                        burc = "boğa";
                    }

                } else {
                    isError = true;
                }
                break;
            case 5:
                if (gun >= 1 && gun <= 31) {
                    if (gun < 22) {
                        burc = "boğa";
                    } else {
                        burc = "ikizler";
                    }

                } else {
                    isError = true;
                }
                break;
            case 6:
                if (gun >= 1 && gun <= 30) {
                    if (gun < 23) {
                        burc = "ikizler";
                    } else {
                        burc = "yengeç";
                    }

                } else {
                    isError = true;
                }
                break;
            case 7:
                if (gun >= 1 && gun <= 31) {
                    if (gun < 23) {
                        burc = "yengeç";
                    } else {
                        burc = "aslan";
                    }

                } else {
                    isError = true;
                }
                break;
            case 8:
                if (gun >= 1 && gun <= 31) {
                    if (gun < 23) {
                        burc = "aslan";
                    } else {
                        burc = "başak";
                    }

                } else {
                    isError = true;
                }
                break;
            case 9:
                if (gun >= 1 && gun <= 30) {
                    if (gun < 23) {
                        burc = "başak";
                    } else {
                        burc = "terazi";
                    }

                } else {
                    isError = true;
                }
                break;
            case 10:
                if (gun >= 1 && gun <= 31) {
                    if (gun < 23) {
                        burc = "terazi";
                    } else {
                        burc = "akrep";
                    }

                } else {
                    isError = true;
                }
                break;
            case 11:
                if (gun >= 1 && gun <= 30) {
                    if (gun < 23) {
                        burc = "akrep";
                    } else {
                        burc = "yay";
                    }

                } else {
                    isError = true;
                }
                break;
            case 12:
                if (gun >= 1 && gun <= 31) {
                    if (gun < 22) {
                        burc = "yay";
                    } else {
                        burc = "oğlak";
                    }

                } else {
                    isError = true;
                }
                break;

            default:
                isError = true;

        }
        if (isError) {
            System.out.println("Hatalı girişi yaptınız!");

        } else {
            System.out.println("Burcunuz: " + burc);
        }
    }
}
