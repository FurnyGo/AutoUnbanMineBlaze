package com.furnygo.autounban;


import net.minecraft.client.Minecraft;
import net.minecraft.util.text.TextComponentString;
import net.minecraftforge.client.event.ClientChatReceivedEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;


public class EventsHandler {
    @SubscribeEvent
    public void clientChat(ClientChatReceivedEvent event) {
         /*if(event.getMessage().getUnformattedText().toLowerCase().contains("chatgame")){
            String str = event.getMessage().getUnformattedText();
            Minecraft.getMinecraft().player.sendMessage(new TextComponentString("“екст скопирован"));
            StringSelection stringSelection = new StringSelection(str);
            Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
            clipboard.setContents(stringSelection, null);
        } */
        if (event.getMessage().getUnformattedText().contains("ƒобро пожаловать на сервер \uFF2D\uFF49\uFF4E\uFF45\uFF22\uFF4C\uFF41\uFF5A\uFF45")){
                Minecraft.getMinecraft().player.sendChatMessage("!&bAuto unban by FurnyGo activated");
        }
         if (event.getMessage().getUnformattedText().startsWith("[*]")) {
            if (event.getMessage().getUnformattedText().toLowerCase().contains("yukikawaii") || event.getMessage().getUnformattedText().toLowerCase().contains("keksik0009") || event.getMessage().getUnformattedText().toLowerCase().contains("theyukisan") || event.getMessage().getUnformattedText().toLowerCase().contains("wata_2000_se") || event.getMessage().getUnformattedText().toLowerCase().contains("asupa") || event.getMessage().getUnformattedText().toLowerCase().contains("krevetka_gg") || event.getMessage().getUnformattedText().toLowerCase().contains("lukardo") || event.getMessage().getUnformattedText().toLowerCase().contains("flexerx") || event.getMessage().getUnformattedText().toLowerCase().contains("hituradem") || event.getMessage().getUnformattedText().toLowerCase().contains("zzparkur") || event.getMessage().getUnformattedText().toLowerCase().contains("semshmidt") || event.getMessage().getUnformattedText().toLowerCase().contains("modiks27") || event.getMessage().getUnformattedText().toLowerCase().contains("__solnyshko_") || event.getMessage().getUnformattedText().toLowerCase().contains("this_is_yara_") || event.getMessage().getUnformattedText().toLowerCase().contains("itsdoome1") || event.getMessage().getUnformattedText().toLowerCase().contains("mr_deokside") || event.getMessage().getUnformattedText().toLowerCase().contains("m1xin") || event.getMessage().getUnformattedText().toLowerCase().contains("jisa_komplit") || event.getMessage().getUnformattedText().toLowerCase().contains("kwickie") || event.getMessage().getUnformattedText().toLowerCase().contains("kativaki_")) {
                Minecraft.getMinecraft().player.sendMessage(new TextComponentString("Ќик персонала обнаружен!"));
            }
            if (event.getMessage().getUnformattedText().contains("на срок") && event.getMessage().getUnformattedText().contains(" времено забанил ") && event.getMessage().getUnformattedText().contains("с причиной: 'ѕричина не указана!'")) {
                String msg = event.getMessage().getUnformattedText();
                int start1 = msg.indexOf("»грок", 3) + 6;
                int end1 = msg.indexOf("времено забанил", 10) - 1;
                int start2 = msg.indexOf("времено забанил", 10) + 16;
                int end2 = msg.indexOf("на срок", 10) - 1;
                String zabanen = msg.substring(start2, end2); //  ого замутили
                String zabanil = msg.substring(start1, end1); //  то замутил
                    Minecraft.getMinecraft().player.sendChatMessage("/unban " + zabanen);
                    Minecraft.getMinecraft().player.sendChatMessage("/ban " + zabanil + " 8h 4.9");
            }
            if (event.getMessage().getUnformattedText().contains("на срок") && event.getMessage().getUnformattedText().contains(" временно заткнул игрока ") && event.getMessage().getUnformattedText().contains("с причиной: 'ѕричина не указана!'")) {
                String msg = event.getMessage().getUnformattedText();
                int start1 = msg.indexOf("[*]") + 4;
                int end1 = msg.indexOf("временно заткнул игрока") - 1;
                int start2 = msg.indexOf("временно заткнул игрока") + 24;
                int end2 = msg.indexOf("на срок", 10) - 1;
                String zabanen = msg.substring(start2, end2); //  ого замутили
                String zabanil = msg.substring(start1, end1); //  то замутил
                    Minecraft.getMinecraft().player.sendChatMessage("/unmute " + zabanen);
                    Minecraft.getMinecraft().player.sendChatMessage("/ban " + zabanil + " 1h 4.9");
            }
             if (event.getMessage().getUnformattedText().contains("на срок") && event.getMessage().getUnformattedText().contains(" временно заткнул игрока ") && (event.getMessage().getUnformattedText().contains("с причиной: 'test'") || event.getMessage().getUnformattedText().contains("с причиной: 'тест'"))) {
                 String msg = event.getMessage().getUnformattedText();
                 int start1 = msg.indexOf("[*]") + 4;
                 int end1 = msg.indexOf("временно заткнул игрока") - 1;
                 String zabanil = msg.substring(start1, end1); //  то замутил
                 Minecraft.getMinecraft().player.sendChatMessage("! " + zabanil + " размучивай игрока.");
             }
             if (event.getMessage().getUnformattedText().contains("на срок") && event.getMessage().getUnformattedText().contains(" времено забанил ") && (event.getMessage().getUnformattedText().contains("с причиной: 'test'") || event.getMessage().getUnformattedText().contains("с причиной: 'тест'"))) {
                 String msg = event.getMessage().getUnformattedText();
                 int start1 = msg.indexOf("»грок", 3) + 6;
                 int end1 = msg.indexOf("времено забанил", 10) - 1;
                 String zabanil = msg.substring(start1, end1); //  то забанил
                 Minecraft.getMinecraft().player.sendChatMessage("! " + zabanil + " разбанивай игрока.");
             }
        }
    }
}
